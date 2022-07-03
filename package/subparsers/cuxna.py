import color
import json


DEFAULT_GISMU_PACKET = {"gloss": None, "tags": ["standard"], "cmarafsi": []}


class Config:
    def __init__(self, label: str):
        self.label = label
        self.data = dict()

    def __enter__(self):
        with open(color.CONFIG_DEFAULTS[self.label], "r") as f:
            self.data = json.load(f)
        return self.data

    def __exit__(self, exc_type, exc_value, exc_traceback):
        with open(color.CONFIG_DEFAULTS[self.label], "w") as f:
            json.dump(self.data, f, indent=2)


C = "bcdfgjklmnprstvxz"
V = "aeiou"


def is_gismu(valsi: str) -> bool:
    if len(valsi) != 5:
        return False
    if valsi[0] not in C:
        return False

    if valsi[1] in C:
        if valsi[2] not in V:
            return False
    elif valsi[1] in V:
        if valsi[2] not in C:
            return False
    else:
        return False

    if valsi[3] not in C:
        return False
    if valsi[4] not in V:
        return False

    return True


def is_cmavo(valsi: str) -> bool:
    if z := valsi[0] not in C and z != ".":
        return False
    for c in valsi[1:]:
        if c not in V and c != "'":
            return False
    return True


def sort_config(config: str) -> None:
    pass


def add_cmarafsi(gismu: str, cmarafsi: str) -> None:
    gismu, cmarafsi = gismu.lower(), cmarafsi.lower()
    if not is_gismu(gismu):
        raise Exception("Error!, {} is not a gismu by morhpology.".format(gismu))
    if not is_cmavo(cmarafsi):
        raise Exception("Error!, {} is not a cmavo by morphology.".format(cmarafsi))

    with Config("gismus") as gismus:
        if gismu not in gismus.keys():
            # TODO: enrich output
            print("hm... {} is not caught, so I will add it.".format(gismu))
            gismus[gismu] = DEFAULT_GISMU_PACKET
        # TODO: enrich output
        gismus[gismu]["cmarafsi"].append(cmarafsi)
        print("ok... successfully added {} as a cmarafsi of {}".format(cmarafsi, gismu))


def set_gloss(gismu: str, gloss: str) -> None:
    gismu = gismu.lower()
    if not is_gismu(gismu):
        raise Exception("Error!, {} is not a gismu by morphology.".format(gismu))

    with Config("gismus") as gismus:
        if gismu not in gismus.keys():
            # TODO: enrich output
            print("hm... {} is not caught, so I will add it.".format(gismu))
            gismus[gismu] = DEFAULT_GISMU_PACKET
        gismus[gismu]["gloss"] = gloss
        # TODO: enrich output
        print("ok... set gloss of gismu {} to {}".format(gismu, gloss))


def set_color(selmaho: str, colour: str) -> None:
    selmaho = selmaho.upper().replace("H", "h")
    if not is_cmavo(selmaho):
        raise Exception("Error!, {} is not a cmavo by morphology.".format(selmaho))

    with Config("selmahos") as selmahos:
        # TODO: ask before adding selmaho
        # TODO: add selmaho if requested and does not exist
        selmahos[selmaho]["color"] = colour
        # TODO: enrichen output
        print("ok... set color of selmaho {} to {}".format(selmaho, colour))


def add_cmavo(cmavo: str, selmaho: str) -> None:
    selmaho = selmaho.upper().replace("H", "h")
    if not is_cmavo(cmavo):
        raise Exception("Error! {} is not a cmavo by morphology.".format(cmavo))
    if not is_cmavo(selmaho.lower().replace("h", "'")):
        raise Exception("Error! {} is not a cmavo by morphology.".format(selmaho))

    with Config("selmahos") as selmahos:
        if selmaho not in selmahos.keys():
            # TODO: enrichen output
            print("hm... selmaho {} is not caught, so I will add it.".format(selmaho))
            selmahos[selmaho] = {"olor": "#0000FF", "cmavos": []}
        if cmavo in selmahos[selmaho]["cmavos"]:
            # TODO: enrichen output
            print(
                "ok.. cmavo {} is already in selmaho {}, so i did nothing".format(
                    cmavo, selmaho
                )
            )
        else:
            selmahos[selmaho]["cmavos"].append(cmavo)
            # TODO: enrichen output
            print(
                "ok... successfully added cmavo {} to selmaho {}".format(cmavo, selmaho)
            )


def parse(args: dict):
    if a := args.add:
        add_cmavo(a[0], a[1])  # (cmavo, selmaho)

    if c := args.color:
        set_color(c[0], c[1])  # (selmaho, color)

    if g := args.gloss:
        set_gloss(g[0], g[1])  # (gismu, gloss)

    if r := args.cmarafsi:
        add_cmarafsi(r[0], r[1])  # (gismu, cmarafsi)

    if s := args.sort:
        sort_config(s)

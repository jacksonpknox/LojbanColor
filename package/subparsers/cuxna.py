import color
import json

from rich import print
from rich.text import Text


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


def add_cmarafsi(gismu: str, cmarafsi: str, config: dict) -> None:
    gismu, cmarafsi = gismu.lower(), cmarafsi.lower()
    if not is_gismu(gismu):
        raise Exception("Error!, {} is not a gismu by morhpology.".format(gismu))
    if not is_cmavo(cmarafsi):
        raise Exception("Error!, {} is not a cmavo by morphology.".format(cmarafsi))

    with Config("gismus") as gismus:
        if gismu not in gismus.keys():
            print(
                Text.assemble(
                    ("hm... ", config["obstacle"]),
                    (gismu, config["gismu"]),
                    (" is not caught, so I will add it.", config["system"])
                )
            )
            gismus[gismu] = DEFAULT_GISMU_PACKET
        gismus[gismu]["cmarafsi"].append(cmarafsi)
        print(
            Text.assemble(
                ("ok... ", config["ok"]),
                ("added ", config["system"]),
                (cmarafsi, config["cmarafsi"]),
                (" as a cmarafsi of ", gismu),
                (".", config["system"])
            )
        )


def set_gloss(gismu: str, gloss: str, config: dict) -> None:
    gismu = gismu.lower()
    if not is_gismu(gismu):
        raise Exception("Error!, {} is not a gismu by morphology.".format(gismu))

    with Config("gismus") as gismus:
        if gismu not in gismus.keys():
            print(
                Text.assemble(
                    ("hm... ", config["obstacle"]),
                    (gismu, config["gismu"]),
                    (" is not caught, so I will add it.", config["system"])
                )
            )
            gismus[gismu] = DEFAULT_GISMU_PACKET
        gismus[gismu]["gloss"] = gloss
        print(
            Text.assemble(
                ("ok... ", config["ok"]),
                ("set gloss of gismu ", config["system"]),
                (gismu, config["gismu"]),
                (" to ", config["system"]),
                (gloss, config["gloss"]),
                (".", config["system"])
            )
        )


def add_cmavo(cmavo: str, selmaho: str, config: dict) -> None:
    selmaho = selmaho.upper().replace("H", "h")
    if not is_cmavo(cmavo):
        raise Exception("Error! {} is not a cmavo by morphology.".format(cmavo))
    if not is_cmavo(selmaho.lower().replace("h", "'")):
        raise Exception("Error! {} is not a cmavo by morphology.".format(selmaho))

    with Config("selmahos") as selmahos:
        if selmaho not in selmahos.keys():
            print(
                Text.assemble(
                    ("hm... ", config["obstacle"]),
                    ("selmaho ", config["system"]),
                    (selmaho, config["cmavo"]),
                    (" is not caught, so I will add it.", config["system"])
                )
            )
            selmahos[selmaho] = {"color": "#0000FF", "cmavos": []}
        if cmavo in selmahos[selmaho]["cmavos"]:
            print(
                Text.assemble(
                    ("ok... ", config["ok"]),
                    ("cmavo ", config["system"]),
                    (cmavo, config["cmavo"]),
                    ("is already in selmaho ", config["system"]),
                    (selmaho, config["cmavo"]),
                    (", so I did nothing.", config["system"])
                )
            )
        else:
            selmahos[selmaho]["cmavos"].append(cmavo)
            print(
                Text.assemble(
                    ("ok... ", config["ok"]),
                    ("added cmavo ", config["system"]),
                    (cmavo, config["cmavo"]),
                    (" to selmaho ", config["system"]),
                    (selmaho, config["cmavo"]),
                )
            )


def set_style(selmaho: str, colour: str, config: dict) -> None:
    selmaho = selmaho.upper().replace("H", "h")
    if not is_cmavo(selmaho):
        raise Exception("Error!, {} is not a cmavo by morphology.".format(selmaho))

    with Config("selmahos") as selmahos:
        # TODO: ask before adding selmaho
        # TODO: add selmaho if requested and does not exist
        selmahos[selmaho]["color"] = colour
        print(
            Text.assemble(
                ("ok... ", config["ok"]),
                ("set color of selmaho ", config["system"]),
                (selmaho, colour),
                (" to ", config["system"]),
                (colour, colour),
                (".", config["system"])
            )
        )


def parse(args: dict):
    with open(color.CONFIG_DEFAULTS["config"], "r") as f:
        config = json.load(f)

    #TODO: style lexeme option

    #TODO: rebrand as style selmaho
    if s := args.style:
        set_style(s[0], s[1], config)  # (selmaho, style)

    if c := args.cmavo:
        add_cmavo(c[1], c[0], config)  # (cmavo, selmaho)

    if g := args.gloss:
        set_gloss(g[0], g[1], config)  # (gismu, gloss)

    if r := args.cmarafsi:
        add_cmarafsi(r[0], r[1], config)  # (gismu, cmarafsi)

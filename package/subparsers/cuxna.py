import plumbing
import json

from rich import print
from rich.text import Text


DEFAULT_GISMU_PACKET = {"gloss": None, "tags": ["standard"], "cmarafsi": []}


class Config:
    def __init__(self, label: str):
        self.label = label
        self.data = dict()

    def __enter__(self):
        with open(plumbing.CONFIG_DEFAULTS[self.label], "r") as f:
            self.data = json.load(f)
        return self.data

    def __exit__(self, exc_type, exc_value, exc_traceback):
        with open(plumbing.CONFIG_DEFAULTS[self.label], "w") as f:
            json.dump(self.data, f, indent=2)


def add_cmarafsi(gismu: str, cmarafsi: str, skari: dict) -> None:
    s = skari["mi'iskari"]["system"]

    gismu, cmarafsi = gismu.lower(), cmarafsi.lower()
    if not plumbing.is_gismu(gismu):
        raise Exception("Error!, {} is not a gismu by morhpology.".format(gismu))
    if not plumbing.is_cmavo(cmarafsi):
        raise Exception("Error!, {} is not a cmavo by morphology.".format(cmarafsi))

    with Config("gismus") as gismus:
        if gismu not in gismus.keys():
            print(
                Text.assemble(
                    ("hm... ", skari["mi'iskari"]["obstacle"]),
                    (gismu, skari["valskari"]["gismu"]),
                    (" is not caught, so I will add it.", s)
                )
            )
            gismus[gismu] = DEFAULT_GISMU_PACKET
        gismus[gismu]["cmarafsi"].append(cmarafsi)
        print(
            Text.assemble(
                ("ok... ", skari["mi'iskari"]["ok"]),
                ("added ", s),
                (cmarafsi, skari["valskari"]["cmarafsi"]),
                (" as a cmarafsi of ", gismu),
                (".", s)
            )
        )


def set_gloss(gismu: str, gloss: str, skari: dict) -> None:
    s = skari["mi'iskari"]["system"]

    gismu = gismu.lower()
    if not plumbing.is_gismu(gismu):
        raise Exception("Error!, {} is not a gismu by morphology.".format(gismu))

    with Config("gismus") as gismus:
        if gismu not in gismus.keys():
            print(
                Text.assemble(
                    ("hm... ", skari["mi'iskari"]["obstacle"]),
                    (gismu, skari["valskari"]["gismu"]),
                    (" is not caught, so I will add it.", s)
                )
            )
            gismus[gismu] = DEFAULT_GISMU_PACKET
        gismus[gismu]["gloss"] = gloss
        print(
            Text.assemble(
                ("ok... ", skari["mi'iskari"]["ok"]),
                ("set gloss of gismu ", s),
                (gismu, skari["mi'iskari"]["gismu"]),
                (" to ", s),
                (gloss, skari["mi'iskari"]["gloss"]),
                (".", s)
            )
        )


def add_cmavo(cmavo: str, selmaho: str, skari: dict) -> None:
    s = skari["mi'iskari"]["system"]
    c = skari["valskari"]["cmavo"]

    selmaho = selmaho.upper().replace("H", "h")
    if not plumbing.is_cmavo(cmavo):
        raise Exception("Error! {} is not a cmavo by morphology.".format(cmavo))
    if not plumbing.is_cmavo(selmaho.lower().replace("h", "'")):
        raise Exception("Error! {} is not a cmavo by morphology.".format(selmaho))

    with Config("selmahos") as selmahos:
        if selmaho not in selmahos.keys():
            print(
                Text.assemble(
                    ("hm... ", skari["mi'iskari"]["obstacle"]),
                    ("selmaho ", s),
                    (selmaho, c),
                    (" is not caught, so I will add it.", s)
                )
            )
            selmahos[selmaho] = {"color": c, "cmavos": []}
        if cmavo in selmahos[selmaho]["cmavos"]:
            print(
                Text.assemble(
                    ("ok... ", skari["mi'iskari"]["ok"]),
                    ("cmavo ", s),
                    (cmavo, c),
                    ("is already in selmaho ", s),
                    (selmaho, c),
                    (", so I did nothing.", s)
                )
            )
        else:
            selmahos[selmaho]["cmavos"].append(cmavo)
            print(
                Text.assemble(
                    ("ok... ", skari["mi'iskari"]["ok"]),
                    ("added cmavo ", s),
                    (cmavo, c),
                    (" to selmaho ", s),
                    (selmaho, c),
                )
            )

            
def set_token_style(token: str, style: str) -> None:
    with Config("skari") as skari:
        if token in skari["mi'iskari"].keys():
            skari["mi'iskari"][token] = style
        elif token in skari["valskari"].keys():
            skari["valskari"][token] = style
        else:
            raise Exception("Error! not a token: " + token)
        s = skari["mi'iskari"]["system"]
        print(
            Text.assemble(
                ("ok... ", skari["mi'iskari"]["ok"]),
                ("set style of token ", s),
                (token, style),
                (" to ", s),
                (style, s),
                (".", s)
            )
        )


def set_selmaho_style(selmaho: str, colour: str, skari: dict) -> None:
    s = skari["mi'iskari"]["system"]
    with Config("selmahos") as selmahos:
        selmaho = plumbing.force_selmaho(selmaho, selmahos)
        selmahos[selmaho]["color"] = colour
        print(
            Text.assemble(
                ("ok... ", skari["mi'iskari"]["ok"]),
                ("set color of selmaho ", s),
                (selmaho, colour),
                (" to ", s),
                (colour, s),
                (".", s)
            )
        )


def parse(args: dict):
    with open(plumbing.CONFIG_DEFAULTS["skari"], "r") as f:
        skari = json.load(f)


    if s := args.selmaho_style:
        set_selmaho_style(s[0], s[1], skari)  # (selmaho, style)

    if t := args.token_style:
        set_token_style(t[0], t[1]) # (token, style)

    if c := args.cmavo:
        add_cmavo(c[1], c[0], skari)  # (cmavo, selmaho)

    if g := args.gloss:
        set_gloss(g[0], g[1], skari)  # (gismu, gloss)

    if r := args.cmarafsi:
        add_cmarafsi(r[0], r[1], skari)  # (gismu, cmarafsi)

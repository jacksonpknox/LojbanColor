from signal import raise_signal
import tubnu.plumbing as plumbing

from rich import print
from rich.prompt import Prompt
from rich.text import Text


DEFAULT_GISMU_PACKET = {"gloss": None, "tags": ["standard"], "cmarafsi": []}
DEFAULT_SELMAHO_PACKET = {"color": "cyan", "cmavos": [], "cmarafsi": dict()}


def set_sumti(gismu: str, sumti: str, valsi: str, skari: dict):
    sumti = int(sumti)
    if sumti not in range(1, 6):
        raise Exception("Error!, {} is out of range.".format(sumti))
    if not plumbing.is_gismu(gismu):
        raise Exception("Error!, {} is not a gismu by morphology.".format(gismu))

    with plumbing.Config("gismus") as gismus:
        if gismu not in gismus.keys():
            raise Exception("Error!, {} is not caught.".format(gismu))
        if "sumti" not in gismus[gismu].keys():
            gismus[gismu]["sumti"] = []
        while len(gismus[gismu]["sumti"]) < sumti:
            gismus[gismu]["sumti"].append("zo'e")
        gismus[gismu]["sumti"][sumti - 1] = valsi

    print(
        Text.assemble(
            ("ok... ", skari["mi'iskari"]["ok"]),
            ("set sumti place ", skari["mi'iskari"]["system"]),
            (str(sumti), skari["mi'iskari"]["gloss"]),
            (" of ", skari["mi'iskari"]["system"]),
            (gismu, skari["valskari"]["gismu"]),
            (" to ", skari["mi'iskari"]["system"]),
            (valsi, skari["mi'iskari"]["gloss"]),
            (".", skari["mi'iskari"]["system"]),
        )
    )


def add_tag_to_gismu(gismu: str, tag: str, skari: dict):
    s = skari["mi'iskari"]["system"]

    gismu = gismu.lower()
    if not plumbing.is_gismu(gismu):
        raise Exception("Error!, {} is not a gismu by morphology.".format(gismu))

    with plumbing.Config("gismus") as gismus:
        if gismu not in gismus.keys():
            raise Exception("Error!, {} is not caught.".format(gismu))
        if "tags" not in gismus[gismu].keys():
            gismus[gismu]["tags"] = []
        if tag not in gismus[gismu]["tags"]:
            gismus[gismu]["tags"].append(tag)
            print(
                Text.assemble(
                    ("ok... ", skari["mi'iskari"]["ok"]),
                    ("added ", s),
                    (tag, skari["mi'iskari"]["gloss"]),
                    (" as a tag of ", s),
                    (gismu, skari["valskari"]["gismu"]),
                    (".", s),
                )
            )


def add_cmavyrafsi(
    selmaho: str, cmavo: str, cmarafsi: str, selmahos: dict, skari: dict
):
    s = skari["mi'iskari"]["system"]
    if not plumbing.is_cmavo(cmavo):
        raise Exception("Error!, {} is not a cmavo by morhpology.".format(cmavo))
    if not plumbing.is_cmarafsi(cmarafsi):
        raise Exception("Error!, {} is not a cmarafsi by morphology.".format(cmarafsi))

    with plumbing.Config("selmahos") as mahos:
        if selmaho not in mahos.keys():
            print(
                Text.assemble(
                    ("hm... ", skari["mi'iskari"]["obstacle"]),
                    (selmaho, skari["valskari"]["cmavo"]),
                    (" is not caught, so I will add it.", s),
                )
            )
            mahos[selmaho] = DEFAULT_SELMAHO_PACKET
        if "cmarafsi" not in mahos[selmaho].keys():
            mahos[selmaho]["cmarafsi"] = dict()  # refactorable safe insertion
        mahos[selmaho]["cmarafsi"][cmarafsi] = cmavo
        print(
            Text.assemble(
                ("ok... ", skari["mi'iskari"]["ok"]),
                ("added ", s),
                (cmarafsi, skari["valskari"]["cmarafsi"]),
                (" as a cmarafsi of ", s),
                (cmavo, skari["valskari"]["cmavo"]),
                (".", s),
            )
        )


def add_cmarafsi(gismu: str, cmarafsi: str, skari: dict) -> None:
    s = skari["mi'iskari"]["system"]

    gismu, cmarafsi = gismu.lower(), cmarafsi.lower()
    if not plumbing.is_gismu(gismu):
        raise Exception("Error!, {} is not a gismu by morhpology.".format(gismu))
    if not plumbing.is_cmarafsi(cmarafsi):
        raise Exception("Error!, {} is not a cmarafsi by morphology.".format(cmarafsi))

    with plumbing.Config("gismus") as gismus:
        if gismu not in gismus.keys():
            print(
                Text.assemble(
                    ("hm... ", skari["mi'iskari"]["obstacle"]),
                    (gismu, skari["valskari"]["gismu"]),
                    (" is not caught, so I will add it.", s),
                )
            )
            gismus[gismu] = DEFAULT_GISMU_PACKET
        gismus[gismu]["cmarafsi"].append(cmarafsi)
        print(
            Text.assemble(
                ("ok... ", skari["mi'iskari"]["ok"]),
                ("added ", s),
                (cmarafsi, skari["valskari"]["cmarafsi"]),
                (" as a cmarafsi of ", s),
                (gismu, skari["valskari"]["gismu"]),
                (".", s),
            )
        )


def set_gloss(gismu: str, gloss: str, skari: dict) -> None:
    s = skari["mi'iskari"]["system"]

    gismu = gismu.lower()
    if not plumbing.is_gismu(gismu):
        raise Exception("Error!, {} is not a gismu by morphology.".format(gismu))

    with plumbing.Config("gismus") as gismus:
        if gismu not in gismus.keys():
            print(
                Text.assemble(
                    ("hm... ", skari["mi'iskari"]["obstacle"]),
                    (gismu, skari["valskari"]["gismu"]),
                    (" is not caught, so I will add it.", s),
                )
            )
            gismus[gismu] = DEFAULT_GISMU_PACKET
        gismus[gismu]["gloss"] = gloss
        print(
            Text.assemble(
                ("ok... ", skari["mi'iskari"]["ok"]),
                ("set gloss of gismu ", s),
                (gismu, skari["valskari"]["gismu"]),
                (" to ", s),
                (gloss, skari["mi'iskari"]["gloss"]),
                (".", s),
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

    with plumbing.Config("selmahos") as selmahos:
        if selmaho not in selmahos.keys():
            print(
                Text.assemble(
                    ("hm... ", skari["mi'iskari"]["obstacle"]),
                    ("selmaho ", s),
                    (selmaho, c),
                    (" is not caught, so I will add it.", s),
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
                    (", so I did nothing.", s),
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


def set_all_selmaho_style(style: str, skari: dict) -> None:
    with plumbing.Config("selmahos") as selmahos:
        for s in selmahos.keys():
            selmahos[s]["color"] = style
        print(
            Text.assemble(
                ("ok...", skari["mi'iskari"]["ok"]),
                ("set color of every selmaho to ", skari["mi'iskari"]["system"]),
                (style, style),
                (".", skari["mi'iskari"]["system"]),
            )
        )


def set_valsi_style(token: str, style: str) -> None:
    with plumbing.Config("skari") as skari:
        if token not in skari["valskari"].keys():
            raise Exception("Error! not a valsi token: " + token)
        skari["valskari"][token] = style
        s = skari["mi'iskari"]["system"]
        print(
            Text.assemble(
                ("ok...", skari["mi'iskari"]["ok"]),
                ("set style of token ", s),
                (token, style),
                (" to ", s),
                (style, s),
                (".", s),
            )
        )


def set_minji_style(token: str, style: str) -> None:
    with plumbing.Config("skari") as skari:
        if token not in skari["mi'iskari"].keys():
            raise Exception("Error! not a minji token: " + token)
        skari["mi'iskari"][token] = style
        s = skari["mi'iskari"]["system"]
        print(
            Text.assemble(
                ("ok...", skari["mi'iskari"]["ok"]),
                ("set style of token ", s),
                (token, style),
                (" to ", s),
                (style, s),
                (".", s),
            )
        )


def set_selmaho_style(selmaho: str, colour: str, skari: dict) -> None:
    s = skari["mi'iskari"]["system"]
    with plumbing.Config("selmahos") as selmahos:
        selmaho = plumbing.force_selmaho(selmaho, selmahos)
        selmahos[selmaho]["color"] = colour
        print(
            Text.assemble(
                ("ok... ", skari["mi'iskari"]["ok"]),
                ("set color of selmaho ", s),
                (selmaho, colour),
                (" to ", s),
                (colour, s),
                (".", s),
            )
        )


def parse(args: dict):
    skari = plumbing.get_config("skari")

    if s := args.selmaho_style:
        set_selmaho_style(s[0], s[1], skari)  # (selmaho, style)

    if m := args.minji_style:
        set_minji_style(m[0], m[1])  # (token, style)

    if v := args.valsi_style:
        set_valsi_style(v[0], v[1])  # (token, style)

    if a := args.all_selmaho_style:
        print(
            Text.assemble(
                ("warning! ", skari["mi'iskari"]["obstacle"]),
                (
                    "this will erase all selma'o color choices.",
                    skari["mi'iskari"]["system"],
                ),
            )
        )
        proceed = Prompt.ask(
            Text("go ahead?", skari["mi'iskari"]["prompt"]),
            choices=["yes", "no"],
            default="no",
        )
        if proceed == "yes":
            set_all_selmaho_style(a[0], skari)

    if c := args.cmavo:
        add_cmavo(c[1], c[0], skari)  # (cmavo, selmaho)

    if g := args.gloss:
        set_gloss(g[0], g[1], skari)  # (gismu, gloss)

    if r := args.cmarafsi:
        add_cmarafsi(r[0], r[1], skari)  # (gismu, cmarafsi)

    if y := args.cmavyrafsi:
        selmahos = plumbing.get_config("selmahos")
        cmavo = y[0]
        selmaho = plumbing.get_selmaho(cmavo, selmahos)
        if selmaho == "UNCAT":
            raise Exception(f"Error! cmavo {cmavo} is not caught.")
        add_cmavyrafsi(selmaho, cmavo, y[1], selmahos, skari)

    if t := args.tag_gismu:
        add_tag_to_gismu(t[0], t[1], skari)  # (gismu, tag)

    if u := args.set_sumti:
        set_sumti(u[0], u[1], u[2], skari)  # (gismu, sumti, valsi)

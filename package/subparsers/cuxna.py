import color
import json


def add_cmarafsi(gismu: str, cmarafsi: str) -> None:
    gismu, cmarafsi = gismu.lower(), cmarafsi.lower()
    with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
        gismus = json.load(f)
    gismus[gismu]["cmarafsi"].append(cmarafsi)
    with open(color.CONFIG_DEFAULTS["gismus"], "w") as f:
        json.dump(gismus, f, indent=2)


def sort_config(config: str) -> None:
    pass
    
        
def add_gloss(gismu: str, gloss: str) -> None:
    gismu = gismu.lower()
    with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
        gismus = json.load(f)
    gismus[gismu]["gloss"] = gloss
    print("ok... successfully added gloss {} to gismu {}".format(gloss, gismu))
    with open(color.CONFIG_DEFAULTS["gismus"], "w") as f:
        json.dump(gismus, f, indent=2)


def set_color(selmaho: str, colour: str) -> None:
    selmaho = selmaho.upper()
    with open(color.CONFIG_DEFAULTS["selmahos"], "r") as f:
        selmahos = json.load(f)
    selmahos[selmaho]["color"] = colour
    with open(color.CONFIG_DEFAULTS["selmahos"], "w") as f:
        json.dump(selmahos, f, indent=2)
        

def add_cmavo(cmavo: str, selmaho: str) -> None:
    selmaho = selmaho.upper()
    with open(color.CONFIG_DEFAULTS["selmahos"], "r") as f:
        selmahos = json.load(f)
    if selmaho not in selmahos.keys():
        selmahos[selmaho] = {"color": "#0000FF", "cmavos": []}
    if cmavo in selmahos[selmaho]["cmavos"]:
        print("ok.. cmavo {} is already in selmaho {}, so i did nothing".format(cmavo, selmaho))
    else:
        selmahos[selmaho]["cmavos"].append(cmavo)
        print("ok... successfully added cmavo {} to selmaho {}".format(cmavo, selmaho))
    with open(color.CONFIG_DEFAULTS["selmahos"], "w") as f:
        json.dump(selmahos, f, indent=2)


def parse(args: dict):
    if a := args.add:
        print("adding cmavo {} to selmaho {}".format(a[0], a[1]))
        add_cmavo(a[0], a[1])

    if c := args.color:
        print("setting color of selmaho {} to {}".format(c[0], c[1]))
        set_color(c[0], c[1])

    if g := args.gloss:
        print("assigning gloss {} to gismu {}".format(g[1], g[0]))
        add_gloss(g[0], g[1])
        
    if s := args.sort:
        sort_config(s)

    if r := args.cmarafsi:
        add_cmarafsi(r[0], r[1])
import json

CONFIG_DEFAULTS = {
    "config": "config/config.json",
    "gismus": "config/gismus.json",
    "selmahos": "config/selmahos.json",
    "skari": "config/skari.json",
}

def get_config(conf: str) -> dict:
    with open(CONFIG_DEFAULTS[conf]) as f:
        return json.load(f)


C = "bcdfgjklmnprstvxz"
V = "aeiou"


def is_cmavo(valsi: str) -> bool:
    if (z := valsi[0]) not in C and z != ".":
        return False
    for c in valsi[1:]:
        if c not in V and c != "'":
            return False
    return True


def get_gloss(gismu: str, gismus: dict) -> str:
    if gismu not in gismus.keys():
        return "UNCAUGHT"
    if "gloss" not in gismus[gismu].keys() or not gismus[gismu]["gloss"]:
        return "UNGLOSSED"
    return gismus[gismu]["gloss"]


def get_selmaho(cmavo: str, selmahos: dict) -> str:
    if not is_cmavo(cmavo):
        raise Exception("Error! not cmav by morphology exception: " + cmavo)
    for selmaho in selmahos.keys():
        if cmavo in selmahos[selmaho]["cmavos"]:
            return selmaho
    return "UNCAT"


def force_selmaho(selmaho: str, selmahos: dict) -> str:
    if selmaho not in selmahos.keys():
        cmavo_form = selmaho.lower().replace('h', '\'')
        if not is_cmavo(cmavo_form):
            raise Exception("Error! not cmav by morphology exception")
        selmaho = get_selmaho(cmavo_form, selmahos)
    return selmaho


def get_gismu(cmarafsi: str, gismus: dict) -> str:
    for gismu in gismus.keys():
        if cmarafsi in gismus[gismu]["cmarafsi"]:
            return gismu
    return "UNCAT"
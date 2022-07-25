import json

CONFIG_DEFAULTS = {
    "minji": "config/minji.json",
    "gismu": "config/gismu.json",
    "selmaho": "config/selmaho.json",
    "skari": "config/skari.json",
    "progress": "config/progress.json",
    "rafsi": "config/rafsi.json",
    "cmavyrafsi": "config/cmavyrafsi.json",
    "cmavo": "config/cmavo.json",
}


def sort_straight(dic: dict) -> dict:
    return dict(sorted(dic.items(), key=lambda x: x[0]))


class Config:
    def __init__(self, label: str):
        self.label = label
        self.data = dict()

    def __enter__(self):
        with open(CONFIG_DEFAULTS[self.label], "r") as f:
            self.data = json.load(f)
        return self.data

    def __exit__(self, exc_type, exc_value, exc_traceback):
        with open(CONFIG_DEFAULTS[self.label], "w") as f:
            json.dump(self.data, f, indent=2)

class SuperConfig:
    def __init__(self, filepath: str):
        self.filepath = filepath
        self.data = dict()

    def __enter__(self):
        with open(self.filepath, "r") as f:
            self.data = json.load(f)
        return self.data
        
    def __exit__(self, exc_type, exc_value, exc_traceback):
        with open(self.filepath, "w") as f:
            json.dump(self.data, f, indent=2)


def get_config(conf: str) -> dict:
    with open(CONFIG_DEFAULTS[conf]) as f:
        return json.load(f)


C = "bcdfgjklmnprstvxz"
V = "aeiou"


def is_selmaho(valsi: str) -> bool:
    valsi = valsi.lower().replace("'", "h")
    if valsi[0] in C:
        valsi = valsi[1:]
    for letter in valsi:
        if letter not in V + 'h':
            return False

def is_cmarafsi(valsi: str) -> bool:
    if valsi[0] not in C:
        return False
    if valsi[1] in C:
        if len(valsi) != 3:
            return False
        if valsi[2] not in V:
            return False
    elif valsi[1] in V:
        if valsi[2] == "'":
            if len(valsi) != 4:
                return False
            if valsi[3] not in V:
                return False
        else:
            if len(valsi) != 3:
                return False
            if valsi[2] not in C + V:
                return False
    else:
        return False
    return True


def is_cmavo(valsi: str) -> bool:
    if (z := valsi[0]) not in C and z != ".":
        return False
    for c in valsi[1:]:
        if c not in V and c != "'":
            return False
    return True


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


def get_gloss(gismu: str, gismus: dict) -> str:
    if gismu not in gismus.keys():
        return "UNCAUGHT"
    if "gloss" not in gismus[gismu].keys() or not gismus[gismu]["gloss"]:
        return "UNGLOSSED"
    return gismus[gismu]["gloss"]


def get_selmaho(cmavo: str, selmahos: dict) -> str:
    if not is_cmavo(cmavo):
        raise Exception("Error! not cmavo by morphology exception: " + cmavo)
    for selmaho in selmahos.keys():
        if cmavo in selmahos[selmaho]["cmavos"]:
            return selmaho
    return "UNCAT"


def force_selmaho(selmaho: str, selmahos: dict) -> str:
    if selmaho not in selmahos.keys():
        cmavo_form = selmaho.lower().replace("h", "'")
        if cmavo_form[0] in V:
            cmavo_form = "." + cmavo_form
        if not is_cmavo(cmavo_form):
            raise Exception("Error! not cmav by morphology exception")
        selmaho = get_selmaho(cmavo_form, selmahos)
    return selmaho


def get_gismu(cmarafsi: str, gismus: dict) -> str:
    for gismu in gismus.keys():
        if cmarafsi in gismus[gismu]["cmarafsi"]:
            return gismu
    return "UNCAT"


def classify_cmarafsi(cmarafsi: str, gismus: dict, selmahos: dict) -> tuple:
    for gismu, dic in gismus.items():
        if "cmarafsi" in dic.keys() and cmarafsi in dic["cmarafsi"]:
            return ("gismu", gismu, get_gloss(gismu, gismus))
    for selmaho, dic in selmahos.items():
        if "cmarafsi" in dic.keys() and cmarafsi in dic["cmarafsi"]:
            return ("cmavo", dic["cmarafsi"][cmarafsi], selmaho)
    return ("UNCAUGHT", "UNCAUGHT", "UNCAUGHT")

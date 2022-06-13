# this script reads a list of selmaho, finds a list of cmavo for each selmaho, and uses it to make a grammar bundle of selmaho
import sys
import chevron


def fix_cmavo(cmavo: str) -> str:
    return "'" + cmavo.replace("'", "\\'") + "'"


def contemplate(selmaho: str):
    with open(selmaho.upper() + ".txt", "r") as g:
        cmavo_list = [fix_cmavo(cmavo) for cmavo in g.read().splitlines()]
    return {
        "little": selmaho.lower(),
        "big": selmaho.upper(),
        "firstmavo": cmavo_list[0],
        "remainmavo": [{"name": cmavo} for cmavo in cmavo_list[1:]],
    }


def main(argv):
    out_name = argv[1]
    rule_name = argv[2]
    in_name = argv[3]

    with open(in_name, "r") as f:
        data_list = [contemplate(selmaho) for selmaho in f.read().splitlines()]
    args = {
        "name": out_name,
        "root_rule": rule_name,
        "first_one": data_list[0]["little"],
        "remainers": [{"little": x["little"]} for x in data_list[1:]],
        "selmahos": data_list,
    }

    with open("selmaho_bundle.mustache", "r") as f:
        with open(out_name + ".g4", "w") as g:
            g.write(chevron.render(f.read(), args))


if __name__ == "__main__":
    main(sys.argv)

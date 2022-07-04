import glob
import color
import json
from rich import print

# n^2
# returns {(cmavo, {selm1, selm2, ...}) for _ in collisions}
def get_collisions(selmahos: dict) -> None:
    pass

# very rough xd
def print_all_documents() -> None:
    docs = glob.glob("library/**/*.jbo", recursive=True)

    print(docs)
    for doc in docs:
        with open(doc, "r") as f:
            print(color.colorize(f.read()))
            print("ok!")
    print('end')

def generate_selmaho_file(target, selmahos, n) -> None:
    selmahos = [s.lower().replace('h','\'') for s in selmahos.keys()]
    with open(target, "w") as f:
        i = 0
        while selmahos:
            f.write(selmahos.pop())
            i = (i + 1) % n
            if i == 0:
                f.write('\n')
            else:
                f.write(' ')

def main():
    with open(color.CONFIG_DEFAULTS["selmahos"]) as f:
        selmahos = json.load(f)
    generate_selmaho_file("library/selmaho.jbo", selmahos, 8)

if __name__ == "__main__":
    main()
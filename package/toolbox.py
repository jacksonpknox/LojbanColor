import glob
import color
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
            print(color.color_prt(f.read()))
            print("ok!")
    print('end')
import yaml
import random

with open("selmaho_wordsets.yaml") as f:
    wordsets = yaml.safe_load(f)

cmavos = [random.choice(tuple(selm[1])) for selm in wordsets.items()]
cmmavos = ""

i = 0
while cmavos:
    if i == 9:
        i = 0
        ender = "\n"
    else:
        ender = " "
    cmmavos += cmavos.pop() + ender
    i += 1

if cmmavos[-1] != "\n":
    cmmavos += "\n"

with open("color_test.jbo", "w") as f:
    f.write(cmmavos)

    

# we may have to stop here for now... ideally we handle the two great metaclasses
# and the brivla metaclass as well
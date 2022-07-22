import argparse
import tubnu.plumbing as plumbing

class Attribute:
    def __init__(self, name):
        self.name = name
        self.kwargs = {
            "action": "store_true",
            "help": "does nothing",
        }   

    def handle(self, value):
        raise NotImplementedError()

        
class SingleStringAttribute(Attribute):
    def __init__(self, name):
        self.name = name
        self.kwargs = {
            "action": "store",
            "nargs": 2,
            "help": f"set the {name} property of KEY to PHRASE",
            "metavar": ("KEY", "PHRASE"),
        }

    def handle(self, value, filepath):
        key = value[0]
        phrase = value[1]
        with plumbing.SuperConfig(filepath) as dic:
            if key not in dic.keys():
                raise Exception(f"{key} not in {filepath}")
            dic[key][self.name] = phrase

gismu_cuxna_schema = [
    SingleStringAttribute("gloss")    
]
        

# attributes -
# TagsListAttribute
# SelectiveTagsListAttribute
# SelectiveSingleNumberAttribute
# BoundedSpringyTagsListAttribute

def parse(args: argparse.Namespace, schema: dict) -> dict:
    for attribute in schema:
        value = getattr(args, attribute.name.replace("-", "_"))
        if value is not None:
            attribute.handle(value, args.filepath)

def inflate_cuxna_parser(parser: argparse.ArgumentParser, schema: dict, default_filepath: str) -> None:
    parser.set_defaults(func=parse)

    parser.add_argument(
        "--filepath",
        action="store",
        nargs=1,
        help="path of json file",
        metavar="FILEPATH",
        default=default_filepath,
    )

    for name, attribute in schema:
        parser.add_argument(
            f"-{name[0]}",
            f"--{name}",
            dest=name.replace("-", "_"),
            **attribute.kwargs,
        )
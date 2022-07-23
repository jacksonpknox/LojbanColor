import argparse
from tubnu.rich_argparse import RichHelpFormatter
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
    def __init__(self, name, verifier: callable=lambda x: True):
        self.name = name
        self.kwargs = {
            "action": "store",
            "nargs": 2,
            "help": f"set the {name} property of KEY to VALUE",
            "metavar": ("KEY", "VALUE"),
        }
        self.verifier = verifier

    def handle(self, value, filepath):
        if not self.verifier(value):
            raise Exception(f"{value} did not pass verification")
        key = value[0]
        phrase = value[1]
        with plumbing.SuperConfig(filepath) as dic:
            if key not in dic.keys():
                raise Exception(f"{key} not in {filepath}")
            dic[key][self.name] = phrase
            dic[key] = plumbing.sort_straight(dic[key])

            
class SingleIntegerAttribute(Attribute):
    def __init__(self, name, verifier: callable=lambda x: True):
        self.name = name
        self.kwargs = {
            "action": "store",
            "nargs": 2,
            "help": f"set the {name} property of KEY to VALUE",
            "metavar": ("KEY", "VALUE"),
        }
        self.verifier = verifier

    def handle(self, value, filepath):
        if not self.verifier(value):
            raise Exception(f"{value} did not pass verification")
        key = value[0]
        num = int(value[1])
        with plumbing.SuperConfig(filepath) as dic:
            if key not in dic.keys():
                raise Exception(f"{key} not in {filepath}")
            dic[key][self.name] = num
            dic[key] = plumbing.sort_straight(dic[key])


class TagsListAttribute(Attribute):
    def __init__(self, name, verifier: callable=lambda x : True):
        self.name = name
        self.kwargs = {
            "action": "store",
            "nargs": 2,
            "help": f"extend the {name} property of KEY to include PHRASE",
            "metavar": ("KEY", "PHRASE"),
        }
        self.verifier = verifier

    def handle(self, value, filepath):
        if not self.verifier(value):
            raise Exception(f"{value} did not pass verification")
        key = value[0]
        phrase = value[1]
        with plumbing.SuperConfig(filepath) as dic:
            if key not in dic.keys():
                raise Exception(f"{key} not in {filepath}")
            if not dic[key].get(self.name):
                dic[key][self.name] = [phrase]
            else:
                if phrase not in dic[key][self.name]:
                    dic[key][self.name].append(phrase)
            dic[key] = plumbing.sort_straight(dic[key])

            
class SpringyTagsListAttribute(Attribute):
    def __init__(self, name, default, verifier: callable=lambda x : True):
        self.name = name
        self.kwargs = {
            "action": "store",
            "nargs": 3,
            "help": f"set the {name} property of KEY at INDEX to VALUE",
            "metavar": ("KEY", "INDEX", "VALUE"),
        }
        self.default = default
        self.verifier = verifier

    def handle(self, value, filepath):
        if not self.verifier(value):
            raise Exception(f"{value} did not pass verification")
        key = value[0]
        index = int(value[1])
        phrase = value[2]
        with plumbing.SuperConfig(filepath) as dic:
            if key not in dic.keys():
                raise Exception(f"{key} not in {filepath}")
            if not dic[key].get(self.name):
                dic[key][self.name] = []
            while len(dic[key][self.name]) < int(index):
                dic[key][self.name].append(self.default)
            dic[key][self.name][index - 1] = phrase
            dic[key] = plumbing.sort_straight(dic[key])


def parse(args: argparse.Namespace) -> dict:
    if args.sort:
        pass

    if args.sort_all_properties:
        with plumbing.SuperConfig(args.filepath) as dic:
            for key in dic.keys():
                dic[key] = plumbing.sort_straight(dic[key])

    if args.sort_key:
        key = args.sort_key[0]
        with plumbing.SuperConfig(args.filepath) as dic:
            dic[key] = plumbing.sort_straight(dic[key])

    for attribute in args.schema:
        value = getattr(args, attribute.name.replace("-", "_"))
        if value is not None:
            attribute.handle(value, args.filepath)


def inflate_cuxna_parser(parser: argparse.ArgumentParser, schema: dict, default_filepath: str) -> None:
    parser.set_defaults(func=parse)
    parser.set_defaults(schema=schema)

    parser.add_argument(
        "--filepath",
        action="store",
        nargs=1,
        help="path of json file",
        metavar="FILEPATH",
        default=default_filepath,
    )

    sort_group = parser.add_argument_group("sort")
    sort_group.add_argument(
        "--sort",
        action="store_true",
        help="sort the keys",
    )
    sort_group.add_argument(
        "--sort-all-properties",
        action="store_true",
        help="sort the properties of all keys",
    )
    sort_group.add_argument(
        "--sort-key",
        action="store",
        nargs=1,
        help="sort the properties of KEY",
        metavar="KEY",
    )

    properties_group = parser.add_argument_group("properties")

    for attribute in schema:
        properties_group.add_argument(
            f"-{attribute.name[0]}",
            f"--{attribute.name}",
            dest=attribute.name.replace("-", "_"),
            **attribute.kwargs,
        )

        
        
gismu_cuxna_schema = [
    SingleStringAttribute("gloss"),
    TagsListAttribute("liste"),
    TagsListAttribute("tags"),
    TagsListAttribute("cmarafsi", verifier=lambda x: plumbing.is_cmarafsi(x[1])),
    SingleIntegerAttribute("namcu", lambda x : int(x[1]) in range(1,6)), # bug. doesnt know it is an int
    SpringyTagsListAttribute("sumti", "zo'e", lambda x : int(x[1]) in range(1,6)),
]
        

def main():
    parser = argparse.ArgumentParser(formatter_class=RichHelpFormatter)
    inflate_cuxna_parser(parser, gismu_cuxna_schema, "config/gismus.json")
    args = parser.parse_args()
    args.func(args)

    
if __name__ == """__main__""":
    main()
import unittest
import color
import copy

from rich.text import Text

CONFIG = {
    "fu'ivla": {
        "color": "#008700"
    },
    "cmene": {
        "color": "#FFFF00"
    },
    "rafsi": {
        "gismu": "#FF0000",
        "y": "yellow",
        "q": "yellow",
        "cafourraf": "#FF8000",
        "ckfourraf": "#FF8080",
        "balraf": "#FFC0C0",
        "bauraf": "#FFFFC0",
        "broraf": "#FFC080",
        "cagismu": "#FF0000",
        "ckagismu": "#FF0000"
    }
}

class TestMethods(unittest.TestCase):
    def test_get_selmaho(self):
        selmahos = {"ZO": {"color": "#0000FF", "cmavos": ["zo"]}, "NOI": {"color": "#0000FF", "cmavos": ["voi", "poi", "noi"]}}
        self.assertEqual(color.get_selmaho("poi", selmahos), "NOI")


    def test_get_cmavo_color(self):
        selmahos = {"ZO": {"color": "#0000FF", "cmavos": ["zo"]}, "NOI": {"color": "#0022FF", "cmavos": ["voi", "poi", "noi"]}}
        self.assertEqual(color.get_cmavo_color("voi", selmahos), "#0022FF")


    def test_put_cmavo(self):
        selmahos = {"ZO": {"color": "#0000FF", "cmavos": ["zo"]}, "NOI": {"color": "#0022FF", "cmavos": ["voi", "poi", "noi"]}}
        t = Text()
        color.put_cmavo(t, "noi", selmahos)
        s = Text().append("")
        self.assertEqual(t, Text().append("noi", style="#0022FF"))


    #TODO: should attempt several compmo-text pairs
    # some day in the far future i can make a really big test that
    # only needs to be run sometimes
    def test_process_compmo(self):
        selmahos = {"ZO": {"color": "#0000FF", "cmavos": ["zo"]}, "NOI": {"color": "#0022FF", "cmavos": ["voi", "poi", "noi"]}}
        t = Text()
        color.process_compmo(t, "zopoizo", selmahos)
        s = Text.assemble(("zo", "#0000FF"), ("poi", "#0022FF"), ("zo", "#0000FF"))
        self.assertEqual(t, s)

        
    #TODO: should attempt several lujvo-text pairs
    def test_process_lujvo(self):
        config = copy.deepcopy(CONFIG)

        t = Text()
        color.process_lujvo(t, "bacygau", config)
        s = Text.assemble(("bac", "#FFC0C0"), ("y", "yellow"), ("gau", "#FFFFC0"))
        self.assertEqual(t,s)

        

if __name__ == '__main__':
    unittest.main()

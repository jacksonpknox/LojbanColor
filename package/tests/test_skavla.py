import unittest
import color

from rich.text import Text

CONFIG = {
    "fu'ivla": {"color": "#008700"},
    "cmene": {"color": "#FFFF00"},
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
        "ckagismu": "#FF0000",
    },
}


class TestMethods(unittest.TestCase):
    def test_get_selmaho(self):
        selmahos = {
            "ZO": {"color": "#0000FF", "cmavos": ["zo"]},
            "NOI": {"color": "#0000FF", "cmavos": ["voi", "poi", "noi"]},
        }
        self.assertEqual(color.get_selmaho("poi", selmahos), "NOI")

    def test_get_cmavo_color(self):
        selmahos = {
            "ZO": {"color": "#0000FF", "cmavos": ["zo"]},
            "NOI": {"color": "#0022FF", "cmavos": ["voi", "poi", "noi"]},
        }
        self.assertEqual(color.get_cmavo_color("voi", selmahos), "#0022FF")

    def test_put_cmavo(self):
        selmahos = {
            "ZO": {"color": "#0000FF", "cmavos": ["zo"]},
            "NOI": {"color": "#0022FF", "cmavos": ["voi", "poi", "noi"]},
        }
        t = Text()
        color.put_cmavo(t, "noi", selmahos)
        s = Text().append("")
        self.assertEqual(t, Text().append("noi", style="#0022FF"))


if __name__ == "__main__":
    unittest.main()

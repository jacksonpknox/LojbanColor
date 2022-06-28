import unittest
import color

class TestMethods(unittest.TestCase):
    def test_get_selmaho(self):
        selmahos = {"ZO": {"color": "#0000FF", "cmavos": ["zo"]}, "NOI": {"color": "0000FF", "cmavos": ["voi", "poi", "noi"]}}
        self.assertEqual(color.get_selmaho("poi", selmahos), "NOI")

if __name__ == '__main__':
    unittest.main()
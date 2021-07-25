import unittest
import list_comprehensions


class TestListComprehension(unittest.TestCase):

    def test_listComprehension(self):
        self.assertListEqual(
            [[0, 0, 0], [0, 0, 1], [0, 0, 2], [0, 1, 0], [0, 1, 1],
                [1, 0, 0], [1, 0, 1], [1, 1, 0], [1, 1, 2]],
            list_comprehensions.get_permutations(1, 1, 2, 3))


if __name__ == '__main__':
    unittest.main()

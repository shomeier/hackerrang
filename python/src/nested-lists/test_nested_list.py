import unittest
import nested_lists


class TestNestedLists(unittest.TestCase):

    def test_nestedLists(self):
        self.assertListEqual(['Bob'], nested_lists.getNamesForSecondLowestGrades(
            [['Bob', 30], ['Marry', 10]]))
        self.assertListEqual(['Bob', 'Carl'], nested_lists.getNamesForSecondLowestGrades(
            [['Bob', 30], ['Marry', 10], ['Carl', 30]]))


if __name__ == '__main__':
    unittest.main()

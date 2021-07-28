import find_second_maximum_number
import unittest


class TestFindSecondMaximumNumber(unittest.TestCase):
    def test_findSecondMaximumNumber(self):
        self.assertEqual(2, find_second_maximum_number.getRunnerUp([1, 2, 3]))
        self.assertEqual(2, find_second_maximum_number.getRunnerUp([3, 2, 1]))
        self.assertEqual(1, find_second_maximum_number.getRunnerUp([1, 1]))
        self.assertEqual(6, find_second_maximum_number.getRunnerUp([6, 6, 6]))
        self.assertEqual(
            5, find_second_maximum_number.getRunnerUp([2, 3, 6, 6, 5]))
        self.assertEqual(
            -100, find_second_maximum_number.getRunnerUp([-100, -99, -100]))


if __name__ == '__main__':
    unittest.main()

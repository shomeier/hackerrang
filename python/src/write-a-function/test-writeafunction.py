import unittest
import writeafunction


class TestWriteAFunction(unittest.TestCase):

    def test_notLeap(self):
        self.assertFalse(writeafunction.is_leap(1800))
        self.assertFalse(writeafunction.is_leap(1900))
        self.assertFalse(writeafunction.is_leap(1990))
        self.assertFalse(writeafunction.is_leap(2100))
        self.assertFalse(writeafunction.is_leap(2200))
        self.assertFalse(writeafunction.is_leap(2300))

    def test_leap(self):
        self.assertTrue(writeafunction.is_leap(2000))
        self.assertTrue(writeafunction.is_leap(2400))


if __name__ == '__main__':
    unittest.main()

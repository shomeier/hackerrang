# https://www.hackerrank.com/challenges/python-string-formatting/problem
def print_formatted(number):
    for i in range(1, number + 1):
        w = len(bin(number)[2:])
        # https://docs.python.org/3/tutorial/inputoutput.html#the-string-format-method
        # https://docs.python.org/3/library/string.html#formatstrings
        # https://docs.python.org/3/library/string.html#formatspec
        print("{0:{width}d} {0:{width}o} {0:{width}X} {0:{width}b}".format(i, width=w))


if __name__ == '__main__':
    n = int(input())
    print_formatted(n)

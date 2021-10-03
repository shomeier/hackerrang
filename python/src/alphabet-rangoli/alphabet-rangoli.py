# https://www.hackerrank.com/challenges/alphabet-rangoli/problem

def get_line(index, size, width):
    line = chr(96 + index)
    for j in range(index + 1, size + 1):
        line = chr(96 + j) + "-" + line + "-" + chr(96 + j)
    return line.center(width, "-") + "\n"


def print_rangoli(size):
    result = ""
    width = (size * 2 - 1) + (size - 1) * 2
    for i in range(size, 0, -1):
        result = result + get_line(i, size, width)
    for i in range(2, size + 1):
        result = result + get_line(i, size, width)
    print(result)


if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)

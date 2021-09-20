# https://www.hackerrank.com/challenges/text-wrap/problem

import textwrap


def wrap(string, max_width):
    # same as "\n".join(textwrap.wrap(string, width))
    return textwrap.fill(string, max_width)


if __name__ == '__main__':
    string, max_width = input(), int(input())
    result = wrap(string, max_width)
    print(result)

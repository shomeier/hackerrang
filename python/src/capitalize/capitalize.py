#!/bin/python3

# https://www.hackerrank.com/challenges/capitalize/problem


def solve(s):
    return " ".join(map(lambda x: x.capitalize(), s.split(" ")))
    # return ' '.join(word.capitalize() for word in s.split(' '))


if __name__ == '__main__':
    s = input().strip()
    print(solve(s))

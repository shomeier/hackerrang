#!/usr/bin/env python3

# https://www.hackerrank.com/challenges/no-idea

from functools import reduce

def calc_happiness(h, i, a, b):
    if i in a:
            return h + 1
    elif i in b:
            return h - 1


if __name__ == '__main__':
    n, m = input().split()
    arr = input().split()
    a = input().split()
    b = input().split()
    happiness = reduce(lambda h, i: calc_happiness(h, i, a, b), arr, 0)
    print(happiness)

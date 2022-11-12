#!/usr/bin/env python3

# https://www.hackerrank.com/challenges/compress-the-string

from itertools import groupby

if __name__ == "__main__":
    i = input()
    t = groupby(i)
    r = list()
    for x, y in t:
        r.append('({}, {})'.format(len(list(y)), x))
    print(" ".join(r))

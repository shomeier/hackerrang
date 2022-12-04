#!/usr/bin/env python3

# https://www.hackerrank.com/challenges/most-commons

import operator
from collections import defaultdict

if __name__ == "__main__":
    s = input()
    d = defaultdict(int)
    for c in s:
        d[c] += 1
    for _ in range(3):
        max_key = max(sorted(d.items()), key=operator.itemgetter(1))[0]
        print(max_key + " " + str(d[max_key]))
        del d[max_key]



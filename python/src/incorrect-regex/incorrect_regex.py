#!/usr/bin/env python3

# https://www.hackerrank.com/challenges/incorrect-regex

import re

if __name__ == '__main__':
    t = int(input())
    for i in range(t):
        s = input()
        try:
            x = re.compile(s)
            print("True")
        except:
            print("False")

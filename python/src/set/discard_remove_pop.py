#!/usr/bin/env python3

# https://www.hackerrank.com/challenges/py-set-discard-remove-pop

import functools

if __name__ == "__main__":
    n = input()
    s = set(map(int,input().split()))
    N = int(input())
    for _ in range(N):
        cmd = input().split()
        if (cmd[0] == "pop"):
            s.pop()
        if (cmd[0] == "remove"):
            s.remove(int(cmd[1]))
        if (cmd[0] == "discard"):
            s.discard(int(cmd[1]))
    print(sum(s))
    # print(functools.reduce(lambda a, b: a+b, s, 0))

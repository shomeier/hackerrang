#!/usr/bin/env python3

# https://www.hackerrank.com/challenges/symmetric-difference

if __name__ == "__main__":
    m = input()
    ms = set(map(int, input().split()))
    n = input()
    ns = set(map(int, input().split()))
    a = ms.symmetric_difference(ns)
    for x in sorted(a):
        print(x)


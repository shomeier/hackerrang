#!/usr/bin/env python3

# https://www.hackerrank.com/challenges/no-idea

if __name__ == '__main__':
    n, m = input().split()
    happiness = 0
    arr = input().split()
    A = input().split()
    B = input().split()
    for i in arr:
        if i in A:
            happiness = happiness + 1
        elif i in B:
            happiness = happiness - 1
    print(happiness)

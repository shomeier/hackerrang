#!/usr/bin/env python3

# https://www.hackerrank.com/challenges/no-idea

if __name__ == '__main__':
    n, m = input().split()
    happiness = 0
    arr = input().split()

    # on sets the searching for an element is much faster than on lists:
    # see: https://stackoverflow.com/questions/8929284/what-makes-sets-faster-than-lists#:~:text=Generally%20the%20lists%20are%20faster,average%20is%20O(1).
    a = set(input().split())
    b = set(input().split())
    for i in arr:
        if i in a:
            happiness+=1
        elif i in b:
            happiness-=1
    print(happiness)

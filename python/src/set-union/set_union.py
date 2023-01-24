#!/usr/bin/env python3

if __name__ == "__main__":
    e = int(input())
    eng = set(map(int, input().split()))
    f = int(input())
    fr = set(map(int, input().split()))
    print(len(eng.union(fr)))

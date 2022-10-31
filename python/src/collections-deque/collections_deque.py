#!/usr/bin/env python3

from collections import deque

if __name__ == "__main__":
    n = int(input())
    d = deque()
    for _ in range(n):
        x = input()
        cmd = x.split()
        if cmd[0] == "append":
            d.append(cmd[1])
        elif cmd[0] == "pop":
            d.pop()
        elif cmd[0] == "appendleft":
            d.appendleft(cmd[1])
        elif cmd[0] == "popleft":
            d.popleft()
    print(" ".join(d))


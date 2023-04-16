#!/usr/bin/env python3

# https://www.hackerrank.com/challenges/piling-up

def is_possible(c):
    asc = False
    m = c[0]
    for e in c:
        if not asc:
            if m < e:
                asc = True
                m = e
        else:
          if m > e:
              return "No"
    return "Yes"

if __name__ == '__main__':
    t = int(input())
    a = []
    for i in range(t):
        n = input()
        c = list(map(int,input().split()))
        a.append(is_possible(c))
    for answer in a:
        print(answer)

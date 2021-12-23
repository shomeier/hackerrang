# https://www.hackerrank.com/challenges/collections-counter

from collections import Counter

if __name__ == '__main__':
    x = int(input())
    n = input().split()
    counter = Counter(n)
    c = int(input())
    revenue = 0
    for i in range(0, c):
        t = input().split()
        n = counter.get(t[0])
        if n and int(n) > 0:
            revenue += int(t[1])
            counter[t[0]]-=1
    print(revenue)

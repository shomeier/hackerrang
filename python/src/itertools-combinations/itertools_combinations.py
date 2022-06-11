# https://www.hackerrank.com/challenges/itertools-combinations

from itertools import combinations

if __name__ == "__main__":
    t, k = input().split()
    s = sorted(t)
    for i in range(int(k)):
        for x in combinations(s,i+1):
            print("".join(x))


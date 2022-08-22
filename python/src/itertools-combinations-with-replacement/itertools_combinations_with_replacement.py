# https://www.hackerrank.com/challenges/itertools-combinations-with-replacement

from itertools import combinations_with_replacement

if __name__ == "__main__":
    S, k = input().split()
    s = sorted(S)
    for i in combinations_with_replacement(s,int(k)):
        print("".join(i))

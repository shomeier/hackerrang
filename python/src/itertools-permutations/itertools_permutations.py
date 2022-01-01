# https://www.hackerrank.com/challenges/itertools-permutations

from itertools import permutations

if __name__ == '__main__':
    i = input().split()
    for p in list(permutations(sorted(i[0]), int(i[1]))):
        print("".join(p))

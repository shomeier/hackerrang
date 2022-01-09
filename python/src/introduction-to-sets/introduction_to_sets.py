# https://www.hackerrank.com/challenges/py-introduction-to-sets

import statistics

def average(array):
    i = set(array)
    return statistics.mean(i)

if __name__ == "__main__":
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)

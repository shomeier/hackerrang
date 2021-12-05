# https://www.hackerrank.com/challenges/itertools-product

from itertools import product

if __name__ == '__main__':
    x = list(map(int,input().split()))
    y = list(map(int,input().split()))
    print (*(product(x, y)))

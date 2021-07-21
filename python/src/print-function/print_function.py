# https://www.hackerrank.com/challenges/python-print/problem
if __name__ == '__main__':
    n = int(input())
    text = range(1, n+1)
    print(*text, sep="")

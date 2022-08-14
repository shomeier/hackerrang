# https://www.hackerrank.com/challenges/py-set-add

if __name__ == "__main__":
    s = set()
    n = int(input())
    for _ in range(n):
        country = input()
        s.add(country)
    print(len(s))

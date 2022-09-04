# https://www.hackerrank.com/challenges/word-order

from collections import OrderedDict

if __name__ == "__main__":
    n = int(input())
    distinct_words = OrderedDict()
    for _ in range(n):
        w = input()
        distinct_words[w] = distinct_words.setdefault(w, 0) + 1
    print(len(distinct_words))
    values = list(map(lambda value: str(value), distinct_words.values()))
    print(" ".join(values))

    # or by using list comprehension
    # print(' '.join([str(distinct_words[k]) for k in distinct_words.keys()]))





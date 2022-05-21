# https://www.hackerrank.com/challenges/py-collections-ordereddict

from collections import OrderedDict

if __name__ == "__main__":
    n = int(input())
    ordered_dictionary = OrderedDict()
    for i in range(n):
        data = input().strip().split()
        name, price = " ".join(data[:-1]), int(data[-1])
        ordered_dictionary[name] = ordered_dictionary.get(name, 0) + int(price)
    for key in ordered_dictionary:
        print(key, ordered_dictionary.get(key))

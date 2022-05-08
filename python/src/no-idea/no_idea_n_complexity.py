#!/usr/bin/env python3

# https://www.hackerrank.com/challenges/no-idea

def count_elem_occurences(arr):
    elements = {}
    for i in arr:
        if i in elements:
            elements[i] = elements[i] + 1
        else:
            elements[i] = 1
    return elements

if __name__ == '__main__':
    n, m = input().split()
    happiness = 0
    arr = input().split()
    a = input().split()
    b = input().split()
    elem_occurences = count_elem_occurences(arr)
    common_a = set(a) & elem_occurences.keys()
    if (common_a):
        for i in common_a:
            happiness = happiness + elem_occurences[i]
    common_b = set(b) & elem_occurences.keys()
    if (common_b):
        for i in common_b:
            happiness = happiness - elem_occurences[i]
    print(happiness)

# https://www.hackerrank.com/challenges/merge-the-tools/problem

import textwrap

def merge_the_tools(string, k):
    for s in textwrap.wrap(string, k):
        print(remove_double_chars(s))

def remove_double_chars(string):
    result = ""
    for i in range(0, len(string)):
        if string[i] not in result:
            result = result + string[i]
    return result

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)

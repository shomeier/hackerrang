# https://www.hackerrank.com/challenges/py-collections-namedtuple

from collections import namedtuple

if __name__ == "__main__":
    n = int(input())
    cols = input()
    Student = namedtuple('Student',cols)
    marks = 0
    for i in range(n):
        l = input().split()
        marks += int(Student(l[0], l[1], l[2], l[3]).MARKS)
    print("{:.2f}".format(marks / n))

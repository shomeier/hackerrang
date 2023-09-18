#!/usr/bin/env python3

# https://www.hackerrank.com/challenges/triangle-quest-2

for i in range(1,int(input())+1): #More than 2 lines will result in 0 score. Do not leave a blank line also
    # basically the pattern is a square of the number 1, 11, 111, 1111 and so on.
    print(((10**i)//9)**2)

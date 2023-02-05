#!/usr/bin/env bash

# https://www.hackerrank.com/rest/contests/master/challenges/lonely-integer-2/hackers/fR0DDY/download_solution?primary=true
# for explanation see: https://oliverjumpertz.com/xor-bitwise-xor-and-using-it-to-solve-an-algorithm-challenge/

read N
result=0
read line
for i in $line
do
    result=`echo $((result ^ $i))`
done
echo $result

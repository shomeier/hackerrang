#!/usr/bin/env bash

# https://www.hackerrank.com/rest/contests/master/challenges/lonely-integer-2/hackers/fR0DDY/download_solution?primary=true

read N
result=0
read line
for i in $line
do
    result=`echo $((result ^ $i))`
done
echo $result

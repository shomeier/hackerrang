#! /usr/bin/env bash

# https://www.hackerrank.com/challenges/bash-tutorials---compute-the-average/problem
sum=0
read N
for ((i = 0; i < N; i++)); do
    read next
    sum=$(($sum + $next))
done
printf "%.3f" $(echo "$sum/$N" | bc -l)

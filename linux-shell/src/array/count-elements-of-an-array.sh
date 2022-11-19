#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/bash-tutorials-count-the-number-of-elements-in-an-array


index=0
while read line
do
    arr[index]=${line}
    index=$((index+1))
done

echo "${#arr[@]}"

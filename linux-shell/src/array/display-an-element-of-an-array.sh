#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/bash-tutorials-display-the-third-element-of-an-array

index=0
while read line
do
    arr[index]=${line};
    index=$((index+1));
done

echo "${arr[3]}"

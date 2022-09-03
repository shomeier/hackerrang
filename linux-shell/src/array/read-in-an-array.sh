#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/bash-tutorials-read-in-an-array

index=0
while read line
do
    arr[index]=${line};
    index=$((index+1));
done

# prints the whole array
echo "${arr[@]}"


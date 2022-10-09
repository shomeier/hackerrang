#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/bash-tutorials-filter-an-array-with-patterns

index=0
while read line
do
    arr[index]=${line};
    index=$((index+1))
done

declare -a result=( ${arr[@]//*[aA]*/} )
echo "${result[@]}"

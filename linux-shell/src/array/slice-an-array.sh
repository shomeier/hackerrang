#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/bash-tutorials-slice-an-array/

while read line
do
    declare -a array=("${array[@]}" "${line}")
done

echo "${array[@]:3:5}"

#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/bash-tutorials-remove-the-first-capital-letter-from-each-array-element

index=0
while read line
do
    arr[index]=${line}
    index=$((index+1))
done

# parameter expansion:
# https://stackoverflow.com/questions/12744031/how-to-change-values-of-bash-array-elements-without-loop
# https://www.gnu.org/software/bash/manual/html_node/Shell-Parameter-Expansion.html
arr=("${arr[@]/[A-Z]/\.}")

echo "${arr[@]}"

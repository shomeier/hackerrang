#! /usr/bin/env bash
# https://www.hackerrank.com/challenges/bash-tutorials---getting-started-with-conditionals/problem?

read x

if [[ "$x" == "y" ]] || [[ "$x" == "Y" ]]; then
    echo "YES"
else
    echo "NO"
fi

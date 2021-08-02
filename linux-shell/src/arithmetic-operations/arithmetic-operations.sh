#! /usr/bin/env bash

# https://www.hackerrank.com/challenges/bash-tutorials---arithmetic-operations/problem
read a

printf "%.3f" $(echo "$a" | bc -l)

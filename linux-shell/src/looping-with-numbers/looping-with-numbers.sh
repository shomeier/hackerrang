#! /usr/bin/env bash
# https://www.hackerrank.com/challenges/bash-tutorials---looping-with-numbers/problem

# this form of loop works in both: bash and zsh
for i in {1..50}; do
    echo "$i"
done

# this form of loop works in both: bash and zsh
for ((i = 1; i <= 50; i++)); do
    echo "$i"
done

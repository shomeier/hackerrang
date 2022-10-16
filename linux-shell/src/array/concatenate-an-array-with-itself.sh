#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/bash-tutorials-concatenate-an-array-with-itself

a=$(paste -s -d' ' -)
echo "$a" "$a" "$a"

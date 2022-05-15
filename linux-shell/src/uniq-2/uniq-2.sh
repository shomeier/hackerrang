#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/text-processing-in-linux-the-uniq-command-2


uniq -c | tr -s ' ' | cut -d ' ' -f 2-

# Does also work:
# uniq -c | awk '{$1=$1};1'

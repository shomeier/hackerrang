#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/text-processing-in-linux-the-uniq-command-3

uniq -ci | tr -s ' ' | cut -d ' ' -f 2-

#! /usr/bin/env bash

# this form of loop only works in bash, not in zsh
for i in {1..99..2}
do
    echo "$i"
done

# this form of loop works in both: bash and zsh
for (( i=1; i <= 99; i++ ))
do
    echo "$i"
done

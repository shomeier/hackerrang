#! /usr/bin/env bash

# https://www.hackerrank.com/challenges/fractal-trees-all/problem

printUnderscores() {
    local i
    for ((i = 0; i < "$1"; i++)); do
        echo -n "_"
    done
}

# 5 = 2 (2)
# 4 = 4 (2 * 2)
# 3 = 8 (2 * 4)
# 2 = 16 (2 * 8)
# 1 = 32 (2 * 16)

# 5 = 1,  21
# 4 = 2,  22
# 3 = 4 (16 / 3),  26
# 2 = 8 (16 / 2),  34
# 1 = 16 (16 / 1), 50
# TODO: Calculate height instead of if statements
getHeight() {
    if [ "$1" -eq 5 ]; then
        return 1
    fi
    if [ "$1" -eq 4 ]; then
        return 2
    fi
    if [ "$1" -eq 3 ]; then
        return 4
    fi
    if [ "$1" -eq 2 ]; then
        return 8
    fi
    if [ "$1" -eq 1 ]; then
        return 16
    fi
}

printTrees() {
    getHeight "$1"
    local height="$?"
    # local height=$((16 / $1))
    # if [ "$1" -eq 5 ]; then
    #     height=1
    # fi
    # echo "$height"

    # numberOfTrees = 1,2,4,8,16 for input param 1,2,3,4,5
    local numberOfTrees=$((2 ** ($1 - 1)))
    # echo "$numberOfTrees"

    local h
    for ((h = 1; h <= "$height"; h++)); do
        # echo "$h"
        local t
        for ((t = 1; t <= $numberOfTrees; t++)); do
            echo "$t"
        done

    done
}

printNoTree() {
    getHeight "$1"
    local height="$?"
    local i
    for ((i = 0; i < "$height"; i++)); do
        printUnderscores 100
        echo ""
    done
}

read n

# print first line
printUnderscores 100
echo ""

for ((i = 5; i > "$n"; i--)); do
    # echo "printNoTree $i"
    printNoTree "$i"
done

# printNoTree 5
for ((i = "$n"; i > 0; i--)); do
    printTrees "$i"
    # printUnderscores "$i"
    # echo ""
done

#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/lonely-integer-2

read n
read line
arr=($line)
index=0
for((i=0;i<${#arr[@]};i++));
do
    found=false
    for((j=0;j<${#tmpArr[@]};j++)); do

        if [ "${tmpArr[$j]}" = "${arr[$i]}" ]
        then
            tmpArr=(${tmpArr[@]:0:$j} ${tmpArr[@]:$(($j + 1))})
            index=$((index-1))
            found=true
            break
        fi
    done

    if [ "$found" = false ]
    then
        tmpArr[${index}]=${arr[i]};
        index=$((index+1))
    fi
done

echo "${tmpArr[@]}"

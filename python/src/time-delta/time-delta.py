#!/bin/python3

# https://www.hackerrank.com/challenges/python-time-delta

from datetime import datetime

def time_delta(t1, t2):
    # Day dd Mon yyyy hh:mm:ss +xxxx
    timeformat = '%a %d %b %Y %H:%M:%S %z'

    dt1 = datetime.strptime(t1, timeformat)
    dt2 = datetime.strptime(t2, timeformat)

    duration = dt1 - dt2
    return str(abs(int(duration.total_seconds())))

if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        t1 = input()

        t2 = input()

        delta = time_delta(t1, t2)

        print(delta)
        # fptr.write(delta + '\n')

    # fptr.close()

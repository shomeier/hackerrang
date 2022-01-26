# https://www.hackerrank.com/challenges/calendar-module

import calendar

if __name__ == "__main__":
    m, d, y = input().split()
    print(calendar.day_name[calendar.weekday(int(y), int(m), int(d))].upper())

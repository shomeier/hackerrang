# https://www.hackerrank.com/challenges/swap-case/problem
def swap_case(s):
    retVal = ""
    for char in s:
        if char.isupper():
            retVal = retVal + char.lower()
        else:
            retVal = retVal + char.upper()
    return retVal


if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)

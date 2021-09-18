# https://www.hackerrank.com/challenges/string-validators/problem
def print_result(string):
    isalnum = isalpha = isdigit = islower = isupper = False
    for char in string:
        if not isalnum:
            isalnum = char.isalnum()
        if not isalpha:
            isalpha = char.isalpha()
        if not isdigit:
            isdigit = char.isdigit()
        if not islower:
            islower = char.islower()
        if not isupper:
            isupper = char.isupper()
    print(isalnum)
    print(isalpha)
    print(isdigit)
    print(islower)
    print(isupper)


if __name__ == '__main__':
    s = input()
    print_result(s)

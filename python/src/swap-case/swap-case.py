# https://www.hackerrank.com/challenges/swap-case/problem

def swap_case(s):
    ret_val = ""
    for char in s:
        if char.isupper():
            ret_val = ret_val + char.lower()
        else:
            ret_val = ret_val + char.upper()
    return ret_val


def swap_case_better(s):
    return s.swapcase()


if __name__ == '__main__':
    s = input()
    result = swap_case_better(s)
    print(result)

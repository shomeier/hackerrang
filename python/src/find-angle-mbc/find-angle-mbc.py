# https://www.hackerrank.com/challenges/find-angle

import math

def calc_angle(ab, bc):
    ac = math.sqrt(pow(ab,2) + pow(bc,2))

    # see here: https://math.stackexchange.com/questions/730033/prove-that-the-straight-line-joining-the-middle-point-of-the-hypotenuse-of-a-rig
    bm = mc = ac / 2

    # see SOH...CAH...TOA here: https://www.mathsisfun.com/algebra/trig-finding-angle-right-triangle.html
    angle = math.degrees(math.asin((ab/2)/bm))
    return round(angle)

if __name__ == '__main__':
    ab = int(input())
    bc = int(input())
    print(calc_angle(ab, bc),"\N{DEGREE SIGN}",sep="")

# https://www.hackerrank.com/challenges/polar-coordinates

from cmath import phase

def calculate_modulus_phase(c):
    r = abs(c)
    p = phase(c)
    print(r)
    print(p)

if __name__ == "__main__":
    calculate_modulus_phase(complex(input()))

# https://www.hackerrank.com/challenges/the-minion-game/problem

def minion_game(string):
    vowels = 'AEIOU'
    length = len(string)
    stuarts_words, kevins_words = 0,0
    for i in range(0, len(string)):
        if string[i] in vowels:
            kevins_words += length - i
        else:
            stuarts_words += length - i
    if stuarts_words > kevins_words:
        print("Stuart", stuarts_words)
    elif kevins_words > stuarts_words:
        print("Kevin", kevins_words)
    else:
        print("Draw")


if __name__ == '__main__':
    s = input().strip()
    minion_game(s)

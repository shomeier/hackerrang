# https://www.hackerrank.com/challenges/the-minion-game/problem

def minion_game(string):
    vowels = 'AEIOU'
    all_strings = [string[i: j] for i in range(len(string))
                   for j in range(i + 1, len(string) + 1)]
    stuarts_words = list(filter(lambda s: not s[0] in vowels, all_strings))
    kevins_words = list(filter(lambda s: s[0] in vowels, all_strings))
    if len(stuarts_words) > len(kevins_words):
        print("Stuart", len(stuarts_words))
    elif len(kevins_words) > len(stuarts_words):
        print("Kevin", len(kevins_words))
    else:
        print("Draw")


if __name__ == '__main__':
    s = input()
    minion_game(s)

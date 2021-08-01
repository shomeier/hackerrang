def get_names(grades):
    first = second = 99999
    for grade in grades:
        if grade[1] < first:
            first, second = grade[1], first
        elif grade[1] < second and grade[1] != first:
            second = grade[1]
    return sorted([grade[0] for grade in grades if grade[1] == second])


if __name__ == '__main__':
    grades = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        grades.append([name, score])

    names = get_names(grades)
    for name in names:
        print(name)

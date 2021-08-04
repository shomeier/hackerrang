# https: // www.hackerrank.com/challenges/finding-the-percentage/problem
if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    target_marks = student_marks.get(query_name)
    if target_marks:
        print('%.2f' % (sum(target_marks) / 3.0))

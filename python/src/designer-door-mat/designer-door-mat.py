def get_pattern(line):
    num_bars = line * 2 - 1
    pattern = ''
    for _ in range(num_bars):
        pattern = pattern + '.|.'
    return pattern


def print_mat(n, m):
    center = n // 2
    for i in range(1, center + 1):
        print(get_pattern(i).center(m, '-'))
    print('WELCOME'.center(m, '-'))
    for i in reversed(range(1, center + 1)):
        print(get_pattern(i).center(m, '-'))


if __name__ == '__main__':
    arr = list(map(int, input().split()))
    print_mat(arr[0], arr[1])

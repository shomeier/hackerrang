def getRunnerUp(runners):
    first = second = -101
    for runner in runners:
        if runner > first:
            # swap variables in python
            first, second = runner, first
        elif runner > second and runner != first:
            second = runner
    if second == -101:
        second = first
    return second


if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    print(getRunnerUp(arr))

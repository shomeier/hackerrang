def solution():
    N = int(input())
    list = []
    for _ in range(N):
        cmd, *args = input().split()
        if cmd == 'insert':
            list.insert(int(args[0]), int(args[1]))
        elif cmd == 'print':
            print(list)
        elif cmd == 'remove':
            list.remove(int(args[0]))
        elif cmd == 'append':
            list.append(int(args[0]))
        elif cmd == 'sort':
            list.sort()
        elif cmd == 'pop':
            list.pop()
        elif cmd == 'reverse':
            list.reverse()


if __name__ == '__main__':
    solution()

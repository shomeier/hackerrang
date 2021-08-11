def solution():
    N = int(input())
    _list = []
    for _ in range(N):
        cmd, *args = input().split()
        if cmd == 'insert':
            _list.insert(int(args[0]), int(args[1]))
        elif cmd == 'print':
            print(_list)
        elif cmd == 'remove':
            _list.remove(int(args[0]))
        elif cmd == 'append':
            _list.append(int(args[0]))
        elif cmd == 'sort':
            _list.sort()
        elif cmd == 'pop':
            _list.pop()
        elif cmd == 'reverse':
            _list.reverse()


if __name__ == '__main__':
    solution()

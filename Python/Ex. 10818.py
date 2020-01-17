import sys

n = int(sys.stdin.readline())

m = list(map(int, sys.stdin.readline().split()))
m.sort()

print(m[0], m[-1])

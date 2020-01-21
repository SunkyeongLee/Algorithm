aLen = int(input())
a = list(map(int, input().split()))

print(a)

addVal = 0
total = 0
a.sort()
for i in range(aLen):
    addVal += a[i]
    total += addVal

print(total)

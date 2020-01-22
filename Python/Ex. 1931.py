n = int(input())
a = []

for i in range(n):
    p = list(map(int, input().split()))
    a.append(p)

a.sort()

tmp = 0
b = []
for i in range(len(a)):
    for j in range(2):
        if (a[i][0] != tmp):
            b.append(a[i])
            tmp = a[i][0]
        else:
            continue

print(a)
print(b)

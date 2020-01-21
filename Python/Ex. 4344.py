n = int(input())

for i in range(n):
    nlist = list(map(int, input().split()))
    stdSum = 0
    for i in range(1, len(nlist)):
        stdSum += nlist[i]
        print(nlist[i])

    stdAvg = (stdSum / nlist[0])
    print("%.3f" % stdAvg)

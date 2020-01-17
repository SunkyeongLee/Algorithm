
maxNum = 0
maxIndx = 0

for i in range(9):
    a = int(input())

    if (a > maxNum):
        maxNum = a
        maxIndx = i+1

print("%d\n%d"%(maxNum, maxIndx))
    

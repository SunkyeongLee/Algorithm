coinNum, price = map(int, input().split())
coinList = []

for i in range(coinNum):
    coinList.append(int(input()))

coin = 0
for i in range(coinNum-1, -1, -1):
    coinNum = price//coinList[i]
    if (coinNum > 0):
        coin += coinNum
        tmpPrice = coinNum * coinList[i]
        price -= tmpPrice
    else:
        continue

print(coin)



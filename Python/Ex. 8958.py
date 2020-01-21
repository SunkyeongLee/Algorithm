"""
OX quiz

As the O sequently appears point +1 adds up each time. First input
defines the number of receiving strings afterwards

input
5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX

output
10
9
7
55
30
"""

import sys

n = int(input())
for i in range(n):
    ox = sys.stdin.readline()
    
    point = 0
    total = 0
    for j in range(len(ox)):
        if ( ox[j] == "O" ):
            point += 1 # add +1 if condition meets
            total += point
        else:
            point = 0 # reset point
    print(total)

row = int(input())
num = 2
for i in range (1,row+1):
    for j in range (i):
        print(num,end=" ")
        num+=2
    print()
row = 8
for i in range (row):
    for j in range (row):
        if(i==j):
            print('*',end=" ")
        else:
            print(" ",end=" ")
    print(" ")

for i in range(row,-1,-1):
    print(i)
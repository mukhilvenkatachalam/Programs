x = list(map(int,input().split()))
number_tuple = tuple(x)
even = tuple(n for n in number_tuple if n%2==0)
odd = tuple(n for n in number_tuple if n%2!=0)

print(even)
print(odd)
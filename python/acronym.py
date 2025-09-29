s = input()
words = s.split()
a = "".join(word[0].upper() for word in words)
print(a)
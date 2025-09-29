arr = input().split()
prefix = ""
for chars in zip(*arr):
    if all(c==chars[0] for c in chars):
        prefix+=chars[0]
    else:
        break

print(prefix)
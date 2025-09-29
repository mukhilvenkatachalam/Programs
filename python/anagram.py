s1=input()
s2=input()
# s1=s1.replace(" ","").lower()
# s2=s2.replace(" ","").lower()
# if(sorted(s1)==sorted(s2)):
#     print("yes")
# else:
#     print("no")

s1_str = "".join(char.lower() for char in s1 if char.isalpha())
s2_str =  "".join(char.lower() for char in s2 if char.isalpha())
if(sorted(s1_str)==sorted(s2_str)):
     print("yes")
else:
     print("no")
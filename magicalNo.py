n=5
demo=''
while(n>0):
    rem=n%2
    demo+=str(rem)
    n=n//2
binary=demo[::-1]

print(binary)

modified=''
for i in range(len(binary)):
    if binary[i]=='0':
        modified+='1'
    else:
        modified+='2'

print(modified)

add=0
for i in modified:
    add+=int(i)

if(add%2!=0):
    print("magical number")
else:
    print("not magical")
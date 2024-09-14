l=[52,66,64,36,45,24,32]

ans=[]
ans.append(l[len(l)-1])
Max=l[len(l)-1]
for i in range(len(l)-2,-1,-1):
    if(l[i]>Max):
        ans.append(l[i])
        Max=l[i]
add=0        
for i in ans:
    add+=i
print(add)

s1="abcde"
s2="aabccde"

d={}

for i in s2:
    if i not in d:
        d[i]=1
    else:
        d[i]+=1

for i in s1:
    if i in d and d[i]>0:
        d[i]-=1

ans=0
for i in d:
    ans+=d[i]

print(ans)
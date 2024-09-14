x=1
y=1
l=[1,3,2,4,5,1]

lx=[]
ly=[]

for i in range(len(l)):
    if(l[i]==x):
        lx.append(i)
for i in range(len(l)):
    if(l[i]==y):
        ly.append(i)
print(lx)
print(ly)
ans=100000
for i in lx:
    for j in ly:
        ans=min(ans,abs(max(i,j)-min(i,j)-1))
        
print(ans)




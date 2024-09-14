# l=[-7,2,4,9,-8,1,6]
l=[-3,-1,-1,-1]
for i in range(1,len(l)-1):
    sumPrev=0
    sumNext=0
    for left in range(0,i):
        sumPrev+=l[left]
    for right in range(i+1,len(l)):
        sumNext+=l[right]
    if(sumPrev==sumNext):
        print(" found")
        print("index",i+1," elm->",l[i])
        flag=False
        break
    else:
        flag=True
if(flag):print("not found")
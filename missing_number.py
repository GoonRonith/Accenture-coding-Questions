l=[3,1,0]
n=len(l)+1
sum1=n*(n-1)//2
sum2=0
for i in l:
    sum2+=i

print(sum1-sum2)
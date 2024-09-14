import math
arr=[3,8,4,2,5,6,7]
sum=0
for items in arr:
    sum+=items
avg=sum/len(arr)
ans=0
for items in arr:
    ans+=(items-avg)**2
    
print(math.sqrt(ans/len(arr)))
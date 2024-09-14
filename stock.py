
l=[7,1,5,3,6,4,10]
cost=0
profit=0
mini=l[0]
for i in range(1,len(l)):
    cost=l[i]-mini
    profit=max(profit,cost)
    mini=min(mini,l[i])
print(profit)
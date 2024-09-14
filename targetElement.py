l=[40,10,4,2,3]
target=100
l.sort()

left,right=0,len(l)-1
while(left <= right):
    mid=(left+right)//2
    if(l[mid]==target):
        print(f" found!! ")
        break
    elif(l[mid] < target):
        left=mid+1
    else:
        right=mid-1
n="2001"
term,cnt=0,0
for i in n:
    data=int(i)
    cnt=0
    for j in n:
        if(term==int(j)):
            cnt+=1
    if(data!=cnt):
        flag=False
        break
    else:
        flag=True
    term+=1
if(flag):
    print("yes")
else:
    print("no")
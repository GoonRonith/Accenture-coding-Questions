s="babab"
l,r=0,len(s)-1
flag=False
while(l<r):
    if(s[l]!=s[r]):
        print("not palindrom")
        flag=False
        break
    else:
        l+=1
        r-=1
        flag=True
if(flag):print("palindrom")

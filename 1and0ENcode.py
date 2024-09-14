temp=ord('A')-1
string="101101110"
cnt=0
ans=''
for i in string:
    if(i!='0'):
        cnt+=1
    else:
        ans+=chr(temp+cnt)
        cnt=0
if(cnt>0):
    ans+=chr(temp+cnt)

print(ans)
name="abeaicaidao"
d={}
ans=''
vowel="aeiou"
for i in name:
    if i in vowel:
        if i in d:
            d[i]+=1
        else:
            d[i]=1
flag=False
occr=0
print(d)
for i in d:
    if(flag==False):
        occr=d[i]
        flag=True
        ans=i
    else:
        if d[i]>occr:
            print(i)
            occr=d[i]
            ans=i
print(ans,occr)

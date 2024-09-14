s="Myself Ronith Goon"
ans=""
l=s.split(" ")
for i in range(len(l)):
    for j in range(len(l[i])-1,-1,-1):
        ans+=l[i][j]
    ans+=" "
print(ans)
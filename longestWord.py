s="ronith is my nameeeeeeeeeeeeeeeeeeeee"
l=s.split(" ")
cnt=0
Max=0

for words in l:
    for letters in words:
        cnt+=1
    
    if(cnt> Max):
        Max=cnt
        ans=words
    cnt=0

print(Max)
print(ans)
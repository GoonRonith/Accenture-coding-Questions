n=4
cnt=1
for i in range(1,n+1):
    print()
    for j in range(i):
        print(cnt,end='')
        for k in range(i-1):
            print(" ",end='')
        cnt+=1


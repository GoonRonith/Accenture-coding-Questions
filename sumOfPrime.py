n=10
add=0
i=2
while(i<=n):
    isPrime=True
    for j in range(2,i//2+1):
        if(i%j==0):
            isPrime=False
            break
        else:
            flag=True
    if(isPrime):
        print(i)
        add+=i
    i+=1

print(add)
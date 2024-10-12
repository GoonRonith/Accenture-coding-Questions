def isPrime(n):
    flag=False
    for i in range(2,n//2+1):
        if(n%i==0): return False
        else:
            flag=True
    return flag

n=1091
add=0

while(n>0):
    rem=n%10
    add+=rem
    n=n//10
print(add)

if(isPrime(add)):print("googly prime")
else:print("not googly prime")




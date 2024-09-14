n=int(input("enter positive number->"))
reversed_number=0
while(n>0):
    rem=n%10
    reversed_number=reversed_number*10+rem
    n=n//10
print(reversed_number)
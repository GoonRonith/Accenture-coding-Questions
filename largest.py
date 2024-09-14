arr=[3,12,45,100,96,32,99]
max=float('-inf')
secondMax=float('-inf')

# for i in arr:
#     if max < i:
#         max=i
# print(max)


for i in arr:
    if max < i:
        secondMax=max
        max=i
    elif(secondMax < i and i!=max):
        secondMax=i

print(max)
print(secondMax)




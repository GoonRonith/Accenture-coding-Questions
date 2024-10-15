x = 1
y = 1
l = [1, 3, 2, 4, 5, 1]

lx = []
ly = []

# Collect indices of occurrences of x and y
for i in range(len(l)):
    if l[i] == x:
        lx.append(i)
for i in range(len(l)):
    if l[i] == y:
        ly.append(i)

print("Indices of x:", lx)
print("Indices of y:", ly)

# Initialize answer to a large number
ans = float('inf')

# If x and y are the same, avoid comparing the same index
if x == y:
    for i in range(len(lx) - 1):  # Compare only consecutive indices of lx
        ans = min(ans, lx[i + 1] - lx[i] - 1)
else:
    # Compare all pairs of indices from lx and ly
    for i in lx:
        for j in ly:
            ans = min(ans, abs(i - j) - 1)

print("Minimum elements between x and y:", ans)

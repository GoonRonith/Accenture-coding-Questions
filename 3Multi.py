l = [9, 18, 2, 1, 4]
target = 36
l.sort()
cnt = 0
for i in range(len(l)):
    j = i + 1
    k = len(l) - 1
    while j < k:
        product = l[i] * l[j] * l[k]
        if product == target:
            print(l[i], l[j], l[k])
            cnt += 1
            j += 1
            k -= 1
            while j < k and l[j] == l[j - 1]:
                j += 1
            while j < k and l[k] == l[k + 1]:
                k -= 1
        elif product < target:
            j += 1
        else:
            k -= 1
print(cnt)

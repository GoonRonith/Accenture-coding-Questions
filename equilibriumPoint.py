# Objective: Write a program that finds an element in a list such that the sum of all elements to the left of this element is equal to the sum of all elements to its right. If such an element is found, the program should return the index of the element (1-based index). If no such element exists, the program should return "not found."

# Steps:

# For each element in the list, calculate the sum of all elements to its left and the sum of all elements to its right.
# If both sums are equal for any element, output the 1-based index of that element.
# If no such element is found after checking the entire list, print "not found."
# Constraints:

# The list will contain at least 3 elements.
# The list may contain both positive and negative integers.
# Example 1:

# For l = [-7, 2, 4, 9, -8, 1, 6]:

# Checking element at index 3 (l[2] = 4):
# Sum of elements to the left = (-7 + 2) = -5
# Sum of elements to the right = (9 + -8 + 1 + 6) = 8
# Sums are not equal.

# Checking element at index 4 (l[3] = 9):
# Sum of elements to the left = (-7 + 2 + 4) = -1
# Sum of elements to the right = (-8 + 1 + 6) = -1
# Sums are equal, so the program will print found index 4 elm-> 9.

l=[-7,2,4,9,-8,1,6]
# l=[-3,-1,-1,-1]
for i in range(1,len(l)-1):
    sumPrev=0
    sumNext=0
    for left in range(0,i):
        sumPrev+=l[left]
    for right in range(i+1,len(l)):
        sumNext+=l[right]
    if(sumPrev==sumNext):
        print(" found")
        print("index",i," elm->",l[i])
        flag=False
        break
    else:
        flag=True
if(flag):print("not found")
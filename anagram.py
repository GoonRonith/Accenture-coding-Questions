def is_anagram(s1,s2):
    if(len(s1)!=len(s2)): return False
    freq=[0 for i in range(26)]
    for i in range(len(s1)):
        freq[ord(s1[i])-ord('a')]+=1
        freq[ord(s2[i])-ord('a')]-=1
    for i in freq:
        if(i!=0): return False
    return True
s1="abba"
s2="abba"
print(is_anagram(s1,s2))

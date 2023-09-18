def isPalindrome(self, s: str) -> bool:
    lst = []
    for i in s:
        if i.isalnum():
            lst.append(i.lower())
    l,r = 0, len(lst)-1
    while(l<=r):
        if lst[l]!=lst[r]:
            return False
        l,r=l+1,r-1
    return True
def solution(nums):
    li = []
    for i in nums:
        if i not in li:
            li.append(i)
    if len(nums)/2 > len(li):
        return len(li)
    return len(nums)/2
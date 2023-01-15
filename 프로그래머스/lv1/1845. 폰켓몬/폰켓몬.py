def solution(nums):
    answer = 0
    numsMax = len(nums)/2
    transHash = dict.fromkeys(nums)
    
    for value in transHash:
	    if answer < numsMax:
		    answer +=1

    return answer
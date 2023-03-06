import math 

def solution(n):
    answer = 0
    
    if n / 7 <= 1 :
        answer += 1
    else : 
        answer += math.ceil(n / 7)
        print(answer)
    
    return answer
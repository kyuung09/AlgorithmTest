def solution(n):
    answer = 1
    a = 0
    
    for i in range(n):
        a, answer = answer, a+answer
    return answer % 1234567
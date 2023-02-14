def solution(ingredient):
    answer = 0
    s = [1, 2, 3, 1]
    i = 0
    
    
    while i < len(ingredient)-3:
        if ingredient[i:i+4] == s:
            del ingredient[i:i+4]
            i = i - 3
            answer += 1
            continue
        i += 1
    
    return answer
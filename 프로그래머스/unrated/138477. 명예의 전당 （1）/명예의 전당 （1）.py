def solution(k, score):
    answer = []
    c = []
    
    for i in score:
        if len(c) < k:
            c.append(i)
        else :
            if min(c) < i :
                c.remove(min(c))
                c.append(i)
        answer.append(min(c))
    return answer
def solution(s):
    answer = 0
    cntx = 0;
    cnto = 0;
    
    for i in s:
        if cntx==cnto:
            answer+=1
            k=i
        if k==i:
            cntx+=1
        else:
            cnto+=1
    return answer
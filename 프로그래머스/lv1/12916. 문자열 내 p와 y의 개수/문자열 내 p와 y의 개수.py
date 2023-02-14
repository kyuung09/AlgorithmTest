def solution(s):
    answer = True
    s = list(s)
    p_cnt = 0
    y_cnt = 0
    
    for i in s:
        if i == "p" or i == "P" :
            p_cnt += 1
            print(p_cnt)
        elif i == "y" or i == "Y":
            y_cnt += 1
        
    if p_cnt == y_cnt :
        return True
    else : 
        return False

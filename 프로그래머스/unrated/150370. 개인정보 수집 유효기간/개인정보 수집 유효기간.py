def solution(today, terms, privacies):
    answer = []
    
    #개인정보 보관 가능 일수를 딕셔너리에 저장
    #모든달은 28일까지 있는걸로 가정함
    dic_terms = {t.split(" ")[0]:int(t.split(" ")[1])*28 for t in terms}
    
    #년도/월/일을 나눠서 더한다
    today_val = 12*28*int(today.split(".")[0]) + 28 * int(today.split(".")[1]) + \
                int(today.split(".")[2])
    
    #today_val값과 dic_terms에 저장된 값만큼 차이가 나는 것을 저장한다(파기)
    for i,p in enumerate(privacies):
        gap = dic_terms[p[-1]]
        p = p[:-2]
        p_val = 12*28*int(p.split(".")[0]) + 28 * int(p.split(".")[1]) + \
                int(p.split(".")[2])
        if today_val - p_val >= gap:
            answer.append(i+1)
            
    return answer
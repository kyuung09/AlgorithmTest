from collections import deque

def solution(s):
    answer = 0
    
    for i in range(len(s)):
        s = deque(s)                # Deque 자료구조 사용
        s.rotate(-1)                # rotate를 사용하여 한칸씩 뒤로 이동
        ss = ''.join(s)             # 구분자들을 join
        
        while '[]' in ss or '{}' in ss or '()' in ss :   # [], {}, ()가 ss에 존재할 경우
            ss = ss.replace('[]','').replace('{}','').replace('()','')   # 공백으로 치환
            
            if not ss :                                                      # 문자열의 길이가 0일 경우 
                answer +=1                                                   # answer +1 
        
    return answer
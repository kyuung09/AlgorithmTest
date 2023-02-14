def solution(k, m, score):
    answer = 0
    score.sort(reverse=True)
    i = 0


    for i in range(0, len(score), m):       # i는 0부터 score의 range까지 m씩 증가
        tmp = score[i:i+m]                  # temp에 score배열을 슬라이싱 하여 넣는다

        if len(tmp) == m:                   # if tmp의 길이와 M의 길이가 같다면        
            answer += min(tmp) * m          # 최소값에다가 가격을 곱해서 총 가격을 구한다
    
    return answer
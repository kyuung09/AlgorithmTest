# t문자열을 각 문자자리에서 p의 길이만큼씩 부분문자열을 만든다.
# t의 부분문자열을 p와 비교하여 작거나 같은 갯수를 출력한다.
# start~end까지 슬라이싱이 하고싶다면 문자열[start:end+1]로 간단하게 슬라이싱이 가능

def solution(t, p):
    answer = 0
    
    p_len = len(p)
    for i in range(len(t)-p_len+1):
        if int(t[i:i+p_len]) <= int(p):
            answer += 1
    
    return answer
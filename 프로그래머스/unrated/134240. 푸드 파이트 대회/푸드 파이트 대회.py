def solution(food):
    answer = ''
    
    for i in range(1, len(food)):                  # food 배열의 수 만큼 반복
        answer += str(i)*(food[i]//2)           # answer 배열에 i를 문자열 형태로 바꿔서 i를 2로 나눈 몫만큼 곱한만큼 저장한다
        temp = ''.join(reversed(list(answer)))  # list에 있는 요소 하나하나를 합쳐서 반대로 저장한다.

    return answer + '0' + temp
import itertools

def solution(number):
    answer = 0
    # combinations 함수를 사용하여 경우의 수 추출
    # 이 중 경우의 수의 합이 0인것만 남기고 제거
    num_combination = [sum(comb) for comb in itertools.combinations(number,3) if sum(comb) == 0]
    answer = len(num_combination)
    
    return answer
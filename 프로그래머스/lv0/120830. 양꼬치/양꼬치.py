import math

def solution(n, k):
    answer = 0
    answer += n * 12000 + (k - math.trunc(n/10)) * 2000
    return answer
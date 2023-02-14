def solution(a, b, n):
    answer = 0
    while n >= a:
        x1 = int((n // a) * b)
        answer += x1
        x2 = n % a
        n = x1 + x2
    return answer;
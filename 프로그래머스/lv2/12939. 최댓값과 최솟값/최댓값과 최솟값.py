def solution(s):
    arr = list(map(int, s.split(' ')))         # map을 사용하여 함수 두개 사용
    arr.sort()                                  
    return str(min(arr)) + " " + str(max(arr))     
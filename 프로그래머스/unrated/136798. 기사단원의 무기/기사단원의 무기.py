def solution(number, limit, power):
    answer = 0
    knightNum = []
    divisor_knight = []

    #기사 번호 담은 배열
    for i in range(number):                         # 5 -> 1~5가 들어감
        knightNum.append(i+1)

    # 각 기사번호 별 약수 담은 배열
    for k in knightNum:
        tmp = []
        for i in range(1, int(k**(1/2)) + 1):
            if k % i == 0 :
                tmp.append(i)
                if ((i**2) != k) :
                    tmp.append(k // i)
        divisor_knight.append(len(tmp))

    
    for d in divisor_knight:
        if d <= limit:
            answer += d
        else :
            answer += power
    print(answer)

    return answer
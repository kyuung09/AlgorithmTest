def solution(phone_number):
    answer = ''
    backNumber = len(phone_number)-4
    answer = '*' * backNumber + phone_number[-4:]

    return answer
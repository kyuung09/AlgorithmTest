def solution(progresses, speeds):
    answer = []
    count = 0

    while progresses:
        if progresses[0] + speeds[0] >= 100:            # progresses[0] + speeds[0]을 더한 값이 100보다 크면 == 작업이 완료되었으면
            progresses.pop(0)                           # progress 큐의 0번에 있는 값을 삭제
            speeds.pop(0)                               # speeds 큐의 0번째에 있는 값을 삭제
            count += 1                                  # count에 1을 증가시킨다
        else:
            if count:                                   # count값에 변경이 생겼을 때 == 작업이 완료된 갯수가 증가되었을 때
                answer.append(count)                    # answer List에 처리한 큐의 카운트값을 저장한다
                count = 0                               # count를 다시 0으로 초기화
            for i in range(len(progresses)):            # progresses의 배열의 크기만큼 반복
                progresses[i] += speeds[i]              # 모든 배열의 값을 한번씩 돌면서 speed만큼 증가시킴
    answer.append(count)                                # 마지막 배열의 값을 처리한 후 cnt 저장
    return answer
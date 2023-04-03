def solution(park, routes):
    answer = []
    x = 0
    y = 0   

    for i in range(len(park)):
        for j in range(len(park[i])):
            if park[i][j] == 'S':
                x = j
                y = i
                break
    for i in routes:
        a = x
        b = y
        direction = i.split(" ")
        
        for j in range(int(i[2])):
            if i[0] == 'N' and b != 0 and park[b-1][a] != 'X':
                b -= 1
                if j == int(i[2]) - 1 :
                    y = b
            elif i[0] == 'S' and b != len(park) - 1 and park[b+1][a] != 'X':
                b += 1
                if j == int(i[2])-1:
                    y = b
            elif i[0] == 'W' and a != 0 and park[b][a-1] != 'X':
                a -= 1
                if j == int (i[2])-1:
                    x = a
            elif i[0] == 'E' and a != len(park[0]) - 1 and park[b][a+1] != 'X':
                a += 1
                if j == int(i[2])-1:
                    x = a   
    return [y, x]
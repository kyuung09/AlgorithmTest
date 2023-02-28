def solution(cards1, cards2, goal):
    idx1,idx2=0,0
    for word in goal:
        if len(cards1)>idx1 and cards1[idx1]==word:         
            # card1 카드뭉치에서 하나씩 빼오기 goal이랑 일치하면 idx +1
            idx1+=1
        elif len(cards2)>idx2 and cards2[idx2]==word:
            # card2 카드뭉치에서 하나씩 빼오기 goal이랑 일치하면 idx +1
            idx2+=1
        else:
            return "No"
            #두 카드 뭉치에서 꺼내서 비교했을 떄 goal이랑 일치하는 단어가없으면 NO return
    return "Yes"
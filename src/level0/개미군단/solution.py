def solution(hp):
    answer = 0
    if hp % 5 >= 0:
        answer += hp // 5
        if hp % 5 == 3:
            answer += 1
        elif hp % 5 > 3:
            answer += 2
        else:
            answer += (hp % 5)
    return answer
def solution(n):
    answer = 0
    y = str(n)
    for x in range(0, len(y)):
        answer += int(y[x])

    return answer
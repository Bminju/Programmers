def solution(box, n):
    answer = 1
    for i in box:
        a = i // n
        answer *= a
    return answer
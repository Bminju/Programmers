def solution(n):
    answer = 0
    for i in range(1, n + 1):
        a = n % i
        if a == 0:
            b = n // i
            answer += b

    return answer

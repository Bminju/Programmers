def solution(n):
    answer = []
    result = []
    i = 2
    while i < n:
        if n % i == 0:
            n //= i
            answer.append(i)
        else:
            i += 1
    answer.append(i)

    for a in answer:
        if a not in result:
            result.append(a)
    return result
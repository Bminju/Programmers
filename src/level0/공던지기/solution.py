def solution(numbers, k):
    answer = 0
    for i in range(0, 2*k, 2):
        if i >= len(numbers):
            i = i % len(numbers)
        answer = numbers[i]

    return answer
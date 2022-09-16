def solution(arr):
    total = 0
    for item in arr:
        total += item
    answer = total / len(arr)

    return answer
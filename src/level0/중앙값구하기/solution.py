def solution(array):
    array.sort(reverse=True)
    i = len(array) // 2

    return array[i]
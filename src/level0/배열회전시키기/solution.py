def solution(numbers, direction):
    i = len(numbers)
    if direction == 'left':
        numbers.insert(i,numbers[0])
        numbers.pop(0)
    else:
        numbers.insert(0,numbers[i-1])
        numbers.pop(i-1)
    return numbers
def solution(sides):
    line = max(sides)
    sides.remove(line)
    if line < sum(sides):
        return 1
    else:
        return 2
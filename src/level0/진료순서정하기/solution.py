def solution(emergency):
    answer = []
    order = {}
    a = sorted(emergency, reverse=True)
    for i, j in enumerate(a):
        order[i+1] = j
    reverse_order = dict(map(reversed,order.items()))
    for x in range(0,len(emergency)):
        answer.append(reverse_order.get(emergency[x]))
    return answer
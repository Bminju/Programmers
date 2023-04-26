def solution(order):
    dan = ['3','6','9']
    str_order = str(order)
    answer = 0
    for i in dan:
        if i in str_order:
            x = str_order.count(i)
            answer += x
    return answer
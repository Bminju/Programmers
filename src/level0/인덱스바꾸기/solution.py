def solution(my_string, num1, num2):
    x = my_string[:num1+1]
    y = my_string[num1+1:]
    answer = x.replace(x[num1],y[num2-num1-1]) + y.replace(y[num2-num1-1],x[num1],1)

    return answer
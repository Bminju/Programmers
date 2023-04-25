def solution(s):
    tmp = s.split(" ")
    answer = 0
    for i in range(0,len(tmp)):
        if tmp[i] == "Z":
            answer -= int(tmp[i-1])
        else:
            answer += int(tmp[i])

    return answer

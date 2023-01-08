def solution(s):
    answer = []
    for i in range(0,len(s)):
        a = s.count(s[i])
        if a == 1:
            answer.append(s[i])
            answer.sort()

    return ''.join(s for s in answer)
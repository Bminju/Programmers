def solution(balls, share):
    n = nm = m = 1
    for x in range(1,balls+1):
        n *= x
    for y in range(1,(balls-share)+1):
        nm *= y
    for z in range(1,share+1):
        m *= z

    return n // (nm * m)
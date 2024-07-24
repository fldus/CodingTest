def solution(dots):
    answer = 0
    i = [[0, 1, 2, 3], [0, 2, 1, 3], [0, 3, 1, 2]]
    for a, b, c, d in i:
        if func(dots[a], dots[b]) == func(dots[c], dots[d]):
            answer = 1
    return answer

def func(d1, d2):
    return (d2[1]-d1[1]) / (d2[0]-d1[0])
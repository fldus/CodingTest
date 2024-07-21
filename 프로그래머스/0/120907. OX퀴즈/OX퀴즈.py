def solution(quiz):
    answer = []
    for i in quiz:
        li = i.split(' ')
        num = int(li[0])+int(li[2]) if li[1]=='+' else int(li[0])-int(li[2])
        answer.append('O' if num==int(li[4]) else 'X')
    return answer
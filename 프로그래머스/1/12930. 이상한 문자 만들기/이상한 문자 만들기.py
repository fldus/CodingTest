def solution(s):
    answer = []
    for li in s.split(' '):
        st = ''
        for i in range(len(li)):
            if i%2 == 0:
                st += li[i].upper();
            else:
                st += li[i].lower();
        answer.append(st)
    return ' '.join(answer)
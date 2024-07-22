def solution(my_str, n):
    answer = [my_str[0:n]]
    for i in range(n, len(my_str), n):
        answer.append(my_str[i:i+n])
    return answer
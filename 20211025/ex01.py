def int_div(a,b):
    print("몫",a//b)
    print("나머지",a%b)


def bet_sum(a,b):
    sum = 0
    for i in range(a+1,b):
        sum += i
    return sum

int_div(5,2)
print(bet_sum(2,5))
print(bet_sum(1,5))




numbers = []

for i in range(9):
    num = int(input())
    numbers.append(num)

max_num = numbers[0]
max_index = 0
for number in numbers:
    if number > max_num:
        max_num = number
        max_index = numbers.index(number)

print(max_num)
print(max_index + 1)
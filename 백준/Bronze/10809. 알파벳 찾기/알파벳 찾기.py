string = input()

string_list = list(string)
alphabet_list = [-1] * 26

for index, alphabet in enumerate(alphabet_list):
    compare = chr(index + ord('a'))

    for string in string_list:
        if compare == string:
            alphabet_list[index] = string_list.index(string)
            break
    print(alphabet_list[index], end=" ")
    
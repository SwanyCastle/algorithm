def solution(array):
    arr_list = list(set(array))
    occurred_cnt_list = []    

    max_occurred_cnt = 0
    max_occurred_number = array[0]

    for i in arr_list:
        if array.count(i) > max_occurred_cnt:
            max_occurred_cnt = array.count(i)
            max_occurred_number = i
        occurred_cnt_list.append(array.count(i))
        
    if occurred_cnt_list.count(max_occurred_cnt) > 1:
        return -1

    return max_occurred_number
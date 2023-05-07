# 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
# 2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?


# 1й метод, который вызывает исключение ValueError в случае, если входной параметр не является числом
def calculate_square_area(side_length):
    if not isinstance(side_length, (int, float)):
        raise ValueError("The side length must be a number.")
    return side_length ** 2

# 2й метод, который вызывает исключение IndexError в случае, если индекс за пределами диапазона
def get_element_from_list(my_list, index):
    try:
        return my_list[index]
    except IndexError:
        raise IndexError("The index is out of range.")

# 3й метод, который вызывает исключение TypeError в случае, если не передано достаточно параметров
def concatenate_strings(*args):
    if len(args) < 2:
        raise TypeError("At least two strings need to be provided.")
    return "".join(args)


# В ValueError (если в метод  calculate_square_area  передать аргумент не числового типа) 
# В IndexError (если в метод  get_element_from_list  передать аргумент  index , который выходит за пределы диапазона списка) 
# В TypeError (если в метод  concatenate_strings  передать менее двух аргументов типа строка)
# Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
# каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
# Если длины массивов не равны, необходимо как-то оповестить пользователя. 
# Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше



class RuntimeException(Exception):
    pass

def div_arrays(arr1, arr2):
    try:
        if len(arr1) != len(arr2):
            raise RuntimeException("Error: arrays have different lengths")
        return [arr1[i] / arr2[i] for i in range(len(arr1))]
    except ZeroDivisionError:
        raise RuntimeException("Error: division by zero")
// В коде три проблемы:
// 1. printSum выдаст исключение FileNotFoundException, которое никогда не возникнет в этом методе. 
// Исключение FileNotFoundException убираем.
// 2. В блоках catch нужно обработать более конкретные исключения и только затем более общие. 
// Во-первых, обработаем IndexOutOfBoundsException, затем NullPointerException и Throwable.
// 3. В блоке try некорректный доступ к элементу массива и он может привести к IndexOutOfBoundsException, а не NullPointerException, как указано в блоке catch. 

// Исправляем код:
public static void main(String[] args) {
    try {
        int a = 90;
        int b = 0;
        System.out.println(a / b);
    } catch (ArithmeticException e) {
        System.out.println("Деление на ноль!");
    }
     try {
        printSum(23, 234);
    } catch (NullPointerException e) {
        System.out.println("Указатель не может указывать на null!");
    }
     try {
        int[] abc = {1, 2};
        abc[2] = 9;
    } catch (IndexOutOfBoundsException e) {
        System.out.println("Массив выходит за пределы своего размера!");
    } catch (Throwable ex) {
        System.out.println("Что-то пошло не так...");
    }
}
 public static void printSum(Integer a, Integer b) {
    System.out.println(a + b);
}  

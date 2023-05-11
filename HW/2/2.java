// Будет исключение ArithmeticException, тк делим на 0... Нужно заменить на d = 0 или любое ненулевое значение.
// Также можно не использовать переменную d. Тоесть уберем /d. Код ниже

// try {
//    int d = 1;
//    double catchedRes1 = intArray[8] / d;
//    System.out.println("catchedRes1 = " + catchedRes1);
// } catch (ArithmeticException e) {
//    System.out.println("Catching exception: " + e);
// }

// Мы сможем получить результат деления, но если не будет в массиве intArray элемента с индексом 8, 
// тогда мы получим исключение ArrayIndexOutOfBoundsException
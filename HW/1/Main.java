import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float number = readFloat("Введите дробное число: ");
        System.out.println("Вы ввели число " + number);
    }

    public static float readFloat(String message) {
        try (Scanner scanner = new Scanner(System.in)) {
            float result = 0;
            boolean inputError = true;
            while (inputError) {
                try {
                    System.out.print(message);
                    result = Float.parseFloat(scanner.nextLine());
                    inputError = false;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введенный текст не является дробным числом.");
                }
            }
            return result;
        }
    }
}
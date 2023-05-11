import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();
            try {
                if (input.isEmpty()) {
                    throw new Exception("Строка не должна быть пустой!");
                }
                System.out.println("Вы ввели: " + input);
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
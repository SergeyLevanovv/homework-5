import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();
        int length = input.length();

        if (length > 50) {
            throw new RuntimeException("Максимальная длина строки - 50 символов.");
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                System.out.println(" ");
            }
            for (int j = 0; j <= 1; j++) {
                System.out.print(input.charAt(j));
            }
            System.out.println();
        }


        for (int i = length - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(input.charAt(j));
            }
            System.out.println();
        }
    }
}


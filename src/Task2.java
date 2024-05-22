import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();

        StringBuilder numbers = new StringBuilder();
        int i = 1;
        while (numbers.length() < 1000) {
            numbers.append(i);
            i++;
        }
        if (n >= 1 && n <= numbers.length()) {
            char digit = numbers.charAt(n - 1);
            System.out.println("Цифра на позиции " + n + ": " + digit);
        } else {
            System.out.println("нккорректная позиция.");
        }
    }
}


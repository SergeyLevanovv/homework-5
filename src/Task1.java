import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку текста: ");
        String text = scanner.nextLine();
        System.out.println("Введите символ: ");
        char symbol = scanner.next().charAt(0);

        int count = 0;
        System.out.println("Индексы_вхождения_символа: ");
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                System.out.print(i + " ");
                count++;
            }
        }
        if (count > 0) {
            System.out.println("\n Количество совпадений: " + count);
        } else {
            System.out.println("\n Совпадений не найдено.");
        }
    }
}


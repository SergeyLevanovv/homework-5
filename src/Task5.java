import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String[] words = input.split("[\\s:]+");

        int count = 0;

        System.out.println("Слова с четным количеством букв: ");

        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.print(word + " ");
                count++;
            }
        }
        System.out.println("");
        System.out.println("Количество слов с четным количеством букв: " + count);
    }
}

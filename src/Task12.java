import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();


        int smileyCount = countSmileys(text);
        System.out.println(smileyCount);
    }

    public static int countSmileys(String text) {
        int count = 0;
        int index = 0;

        while (index < text.length()) {
            char currentChar = text.charAt(index);
            if (currentChar == ';' || currentChar == ':') {
                int endIndex = index + 1;
                while (endIndex < text.length() && text.charAt(endIndex) == '-') {
                    endIndex++;
                }
                if (endIndex < text.length() && isBracket(text.charAt(endIndex))) {
                    char bracketChar = text.charAt(endIndex);
                    while (endIndex < text.length() && text.charAt(endIndex) == bracketChar) {
                        endIndex++;
                    }
                    if (endIndex == index + 2 + (endIndex - index - 2) / 2) {
                        count++;
                    }
                }
            }
            index++;
        }
        return count;
    }

    public static boolean isBracket (char c) {
        return c == '(' || c == ')' || c == ']' || c == '[';
    }
}


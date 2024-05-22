import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Введите строку 2: ");
        String str2 = scanner.nextLine();

        boolean isAnagram = checkAnagram(str1, str2);

        if (isAnagram) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean checkAnagram(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll("[^a-za-яё]", "");
        str2 = str2.toLowerCase().replaceAll("[^a-za-яё]", "");

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите предложение ");
        String pred = scanner.nextLine();
        String[] slova = pred.split(" ");
        int obdl = 0;
        for (String word : slova) {
            obdl += word.length();
        }
        double sreddl = (double) obdl / slova.length;
        System.out.println("Средняя длина слова: " + sreddl);
    }
}


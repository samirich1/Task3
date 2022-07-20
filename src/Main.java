import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite size tree");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) System.out.print("*");
            System.out.println(" ");
        }
    }
}
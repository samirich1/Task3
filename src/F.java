import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite size tree");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int e = size; e > i; e--) {
                System.out.print(" *");
            }
                System.out.println();
            }
        }
    }

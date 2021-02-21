package DrawingFigures;

import java.util.Scanner;

public class TriangleofDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.printf("$");
            for (int j = 0; j < i; j++) {
                System.out.printf(" $");

            }
            System.out.println();
        }
    }
}

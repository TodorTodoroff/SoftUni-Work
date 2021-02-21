package DrawingFigures;

import java.util.Scanner;

public class Rectangleof1010Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.printf("*");
            for (int j = 0; j < n-1; j++) {
                System.out.print(" *");

            }
            System.out.println();
        }

    }
}

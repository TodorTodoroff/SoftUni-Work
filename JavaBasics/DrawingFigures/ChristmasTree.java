package DrawingFigures;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < n + 1; row++) {

            for (int col = 0; col < n - row; col++) {
                System.out.printf(" ");

            }
            for (int col = 0; col < row; col++) {
                System.out.printf("*");
            }
        System.out.printf(" | ");

            for (int col = 0; col < row; col++) {
                System.out.printf("*");
            }
            System.out.println();

        }
    }

}


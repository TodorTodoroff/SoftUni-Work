package MoreExercises;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sector = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int seats = Integer.parseInt(scanner.nextLine());

        char letter = sector.charAt(0);
        int counter = 0;

        for (char i = 'A'; i <= letter; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j % 2 == 0) {
                    for (int k = 97; k <= 98 + seats; k++) {
                        System.out.printf("%c%d%c%n", i, j, k);
                        counter++;
                    }
                } else {
                    for (int k = 97; k <= 96 + seats; k++) {
                        System.out.printf("%c%d%c%n", i, j, k);
                        counter++;

                    }

                }

            }
            rows++;
        }
        System.out.printf("%d", counter);

    }
}

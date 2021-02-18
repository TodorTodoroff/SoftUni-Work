package MoreExercises;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        String fourthNumber = "";

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {

                        if (j > i && k > l) {
                            int sum = i * j + k * l;
                            if (sum == controlNumber) {
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                                counter++;
                                if (counter == 4) {
                                    fourthNumber = String.format("%d%d%d%d", i, j, k, l);
                                }
                            }
                        }

                    }

                }

            }

        }
        if (counter >= 4) {
            System.out.printf("%nPassword: %s", fourthNumber);
        } else {
            System.out.printf("%nNo!");
        }

    }
}

package MoreExercises;

import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hundreds = Integer.parseInt(scanner.nextLine());
        int tens = Integer.parseInt(scanner.nextLine());
        int ones = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= hundreds; i += 2) {
            for (int j = 2; j <= tens; j++) {
                for (int k = 2; k <= ones; k += 2) {
                    if (j == 3 || j == 5 || j == 7 || j == 2) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }

                }

            }

        }


    }
}

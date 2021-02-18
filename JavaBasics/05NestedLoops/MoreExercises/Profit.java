package MoreExercises;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneBgn = Integer.parseInt(scanner.nextLine());
        int twoBgn = Integer.parseInt(scanner.nextLine());
        int fiveBgn = Integer.parseInt(scanner.nextLine());
        int totalBgn = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= oneBgn; i++) {
            for (int j = 0; j <= twoBgn; j++) {
                for (int k = 0; k <= fiveBgn; k++) {
                    int sum = i + j * 2 + k * 5;
                    if (sum == totalBgn) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n",
                                i, j, k, totalBgn);
                    }
                }

            }

        }


    }
}

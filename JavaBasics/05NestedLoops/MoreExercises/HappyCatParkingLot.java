package MoreExercises;

import java.util.Scanner;

public class HappyCatParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double total = 0;

        for (int i = 1; i <= days; i++) {
            double dailySum = 0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 != 0) {
                    if (j % 2 == 0) {
                        dailySum += 1.25;
                    } else {
                        dailySum += 1;
                    }
                } else {
                    if (j % 2 == 0) {
                        dailySum += 1;
                    } else {
                        dailySum += 2.5;
                    }
                }

            }
            System.out.printf("Day: %d - %.2f leva%n", i, dailySum);
            total += dailySum;
            dailySum = 0;

        }
        System.out.printf("Total: %.2f leva", total);

    }
}

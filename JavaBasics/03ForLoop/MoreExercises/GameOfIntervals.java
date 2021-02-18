package MoreExercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        double p6 = 0;
        double total = 0;


        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(scanner.nextLine());

            if (num >= 0 && num <= 9) {
                total += num * 0.2;
                p1++;

            } else if (num <= 19 && num >= 10) {
                total += num * 0.3;
                p2++;

            } else if (num <= 29&& num >= 20) {
                total += num * 0.4;
                p3++;

            } else if (num <= 39 && num >= 30) {
                total += 50;
                p4++;

            } else if (num <= 50 && num >= 40) {
                total += 100;
                p5++;

            } else {
                total /= 2;
                p6++;

            }
        }
        System.out.printf("%.2f\n" +
                        "From 0 to 9: %.2f%%\n" +
                        "From 10 to 19: %.2f%%\n" +
                        "From 20 to 29: %.2f%%\n" +
                        "From 30 to 39: %.2f%%\n" +
                        "From 40 to 50: %.2f%%\n" +
                        "Invalid numbers: %.2f%%",
                total,
                (p1 / n) * 100,
                (p2 / n) * 100,
                (p3 / n) * 100,
                (p4 / n) * 100,
                (p5 / n) * 100,
                (p6 / n) * 100);


    }
}

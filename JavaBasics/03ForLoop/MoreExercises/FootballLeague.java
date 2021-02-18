package MoreExercises;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;


        for (int i = 0; i < n; i++) {
            String sector = scanner.nextLine();

            switch (sector) {
                case "A":
                    p1++;
                    break;
                case "B":
                    p2++;
                    break;
                case "V":
                    p3++;
                    break;
                case "G":
                    p4++;
                    break;

            }

        }
        System.out.printf("%.2f%%\n" +
                        "%.2f%%\n" +
                        "%.2f%%\n" +
                        "%.2f%%\n" +
                        "%.2f%%",
                (p1 / n) * 100,
                (p2 / n) * 100,
                (p3 / n) * 100,
                (p4 / n) * 100,
                ((double) n / capacity) * 100);
    }
}

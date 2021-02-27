package FinalFebruary2021;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = 1;
        int meters = 5364;
        String input = scanner.nextLine();

        while (days <= 5 && !"END".equals(input) && meters < 8848) {
            if ("Yes".equals(input)) {
                days++;
            }
            if (days <= 5) {
                int dailyMeters = Integer.parseInt(scanner.nextLine());
                meters += dailyMeters;
                if (meters < 8848) {
                    input = scanner.nextLine();
                }
            }
        }
        if (days <= 5 && meters >= 8848) {
            System.out.printf("Goal reached for %d days!", days);
        } else {
            System.out.printf("Failed!%n%d", meters);
        }

    }
}

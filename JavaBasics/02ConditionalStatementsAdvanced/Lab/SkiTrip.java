package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String attitude = scanner.nextLine();

        double result = 0;

        if ("room for one person".equals(room)) {

            result = 18 * (days - 1);

        } else if ("apartment".equals(room)) {
            if (days < 10) {
                result = (25 * (days - 1)) * 0.7;

            } else if (days <= 15) {
                result = (25 * (days - 1)) * 0.65;

            } else if (days > 16) {
                result = (25 * (days - 1)) * 0.5;

            }

        } else if ("president apartment".equals(room)) {
            if (days < 10) {
                result = (35 * (days - 1)) * 0.9;
            } else if (days <= 15) {
                result = (35 * (days - 1)) * 0.85;
            } else if (days > 16) {
                result = (35 * (days - 1)) * 0.8;
            }

        }
        if ("positive".equals(attitude)) {
            result = result + result * 0.25;
        } else {
            result = result - result * 0.1;
        }
        System.out.printf("%.2f", result);

    }
}

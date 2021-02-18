package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int junior = Integer.parseInt(scanner.nextLine());
        int senior = Integer.parseInt(scanner.nextLine());
        String track = scanner.nextLine();

        double sum = 0;

        switch (track) {
            case "trail":
                sum = (junior * 5.50 + senior * 7) * 0.95;
                break;
            case "cross-country":
                if (senior + junior >= 50) {
                    sum = ((junior * 8 + senior * 9.50) * 0.75) * 0.95;
                } else {
                    sum = (junior * 8 + senior * 9.50) * 0.95;
                }

                break;
            case "downhill":
                sum = (junior * 12.25 + senior * 13.75) * 0.95;
                break;
            case "road":
                sum = (junior * 20 + senior * 21.50) * 0.95;
                break;
        }
        System.out.printf("%.2f", sum);
    }
}

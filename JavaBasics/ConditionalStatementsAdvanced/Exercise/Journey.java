package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;
        String destination = "";
        String holiday = "";


        if (budget <= 100) {
            destination = "Bulgaria";

            switch (season) {
                case "summer":
                    holiday = "Camp";
                    budget *= 0.3;
                    break;
                case "winter":
                    holiday = "Hotel";
                    budget *= 0.7;
                    break;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    holiday = "Camp";
                    budget *= 0.4;
                    break;
                case "winter":
                    holiday = "Hotel";
                    budget *= 0.8;
                    break;
            }
        } else {
            destination = "Europe";
            holiday = "Hotel";
            budget *= 0.9;

        }
        System.out.printf("Somewhere in %s%n%s - %.2f", destination, holiday, budget);

    }
}

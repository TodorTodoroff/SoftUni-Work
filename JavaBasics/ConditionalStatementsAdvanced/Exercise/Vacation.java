package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String location = "";
        String type = "";

        if (budget <= 1000) {
            type = "Camp";
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    budget *= 0.65;
                    break;
                case "Winter":
                    location = "Morocco";
                    budget *= 0.45;
                    break;
            }


        } else if (budget <= 3000) {
            type = "Hut";
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    budget *= 0.80;
                    break;
                case "Winter":
                    location = "Morocco";
                    budget *= 0.60;
                    break;
            }

        } else {
            type = "Hotel";
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    budget *= 0.90;
                    break;
                case "Winter":
                    location = "Morocco";
                    budget *= 0.90;
                    break;
            }

        }
        System.out.printf("%s - %s - %.2f", location, type, budget);
    }
}

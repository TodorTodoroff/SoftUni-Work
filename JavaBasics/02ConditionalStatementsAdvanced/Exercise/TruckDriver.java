package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double distance = Double.parseDouble(scanner.nextLine());

        double wage = 0;

        if (distance <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    wage = ((distance * 0.75) * 4) * 0.9;
                    break;
                case "Summer":
                    wage = ((distance * 0.90) * 4) * 0.9;
                    break;
                case "Winter":
                    wage = ((distance * 1.05) * 4) * 0.9;
                    break;
            }


        } else if (distance <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    wage = ((distance * 0.95) * 4) * 0.9;
                    break;
                case "Summer":
                    wage = ((distance * 1.10) * 4) * 0.9;
                    break;
                case "Winter":
                    wage = ((distance * 1.25) * 4) * 0.9;
                    break;
            }

        } else if (distance <= 20000) {
            wage = ((distance * 1.45) * 4) * 0.9;

        }
        System.out.printf("%.2f", wage);
    }
}

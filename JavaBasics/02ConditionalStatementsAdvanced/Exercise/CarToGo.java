package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String classcar = "";
        String car = "";
        double price = 0;

        if (budget <= 100) {
            classcar = "Economy class";
            switch (season) {
                case "Summer":
                    car = "Cabrio";
                    price = 0.35 * budget;
                    break;
                case "Winter":
                    car = "Jeep";
                    price = 0.65 * budget;
                    break;
            }

        } else if (budget <= 500) {
            classcar = "Compact class";
            switch (season) {
                case "Summer":
                    car = "Cabrio";
                    price = 0.45 * budget;
                    break;
                case "Winter":
                    car = "Jeep";
                    price = 0.80 * budget;
                    break;
            }

        } else {
            classcar = "Luxury class";
            car = "Jeep";
            price = 0.90 * budget;


        }
        System.out.printf("%s%n%s - %.2f", classcar, car, price);
    }
}

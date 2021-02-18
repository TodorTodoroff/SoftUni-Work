package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int kids = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double price = kids * nights;
        String sport = "";


        switch (season) {
            case "Winter":
                switch (group) {
                    case "boys":
                        sport = "Judo";
                        price *= 9.60;
                        break;
                    case "girls":
                        sport = "Gymnastics";
                        price *= 9.60;

                        break;
                    case "mixed":
                        sport = "Ski";
                        price *= 10;
                        break;
                }

                break;
            case "Spring":
                switch (group) {
                    case "boys":
                        sport = "Tennis";
                        price *= 7.20;
                        break;
                    case "girls":
                        sport = "Athletics";
                        price *= 7.20;

                        break;
                    case "mixed":
                        sport = "Cycling";
                        price *= 9.50;
                        break;
                }

                break;
            case "Summer":
                switch (group) {
                    case "boys":
                        sport = "Football";
                        price *= 15;
                        break;
                    case "girls":
                        sport = "Volleyball";
                        price *= 15;

                        break;
                    case "mixed":
                        sport = "Swimming";
                        price *= 20;
                        break;
                }

                break;

        }
        if (kids >= 10 && kids < 20) {
            price *= 0.95;

        } else if (kids >= 20 && kids < 50) {
            price *= 0.85;

        } else if (kids >= 50){

            price *= 0.50;
        }
        System.out.printf("%s %.2f lv.", sport, price);
    }
}

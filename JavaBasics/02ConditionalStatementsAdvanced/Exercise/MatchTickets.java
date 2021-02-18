package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double ticketprice = 0;
        String output = "";


        if (people >= 1 && people <= 4) {
            budget *= 0.25;

        } else if (people <= 9) {
            budget *= 0.40;

        } else if (people <= 24) {
            budget *= 0.50;

        } else if (people <= 49) {

            budget *= 0.60;
        } else {
            budget *= 0.75;
        }
        switch (category) {
            case "VIP":
                ticketprice = 499.99 * people;

                if (budget >= ticketprice) {
                    output = String.format("Yes! You have %.2f leva left.", budget - ticketprice);
                } else {
                    output = String.format("Not enough money! You need %.2f leva.", ticketprice - budget);
                }
                break;
            case "Normal":
                ticketprice = 249.99 * people;

                if (budget >= ticketprice) {
                    output = String.format("Yes! You have %.2f leva left.", budget - ticketprice);
                } else {
                    output = String.format("Not enough money! You need %.2f leva.", ticketprice - budget);

                }
                break;
        }
        System.out.println(output);

    }
}

package ExamProblems.March2020;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double price = 0;

        String output = "";

        switch (sex) {
            case "m":
                switch (sport) {
                    case "Gym":
                        price = 42;
                        break;
                    case "Boxing":
                        price = 41;
                        break;
                    case "Yoga":
                        price = 45;
                        break;
                    case "Zumba":
                        price = 34;
                        break;
                    case "Dances":
                        price = 51;
                        break;
                    case "Pilates":
                        price = 39;
                        break;
                }
                break;

            case "f":
                switch (sport) {
                    case "Gym":
                        price = 35;
                        break;
                    case "Boxing":
                        price = 37;
                        break;
                    case "Yoga":
                        price = 42;
                        break;
                    case "Zumba":
                        price = 31;
                        break;
                    case "Dances":
                        price = 53;
                        break;
                    case "Pilates":
                        price = 37;
                        break;
                }

                break;

        }
        if (age <= 19) {
            price *=0.8;
        }
        if (price < budget) {
            output = String.format("You purchased a 1 month pass for %s.", sport);
        } else {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            output = String.format("You don't have enough money! You need $%s more.",
                    decimalFormat.format(price - budget));
        }
        System.out.println(output);

    }
}

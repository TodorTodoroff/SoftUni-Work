package ExamProblems.May2019;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        fuel *= 2.1;
        double price = 0;
        String output = "";

        if ("Saturday".equals(day)) {
            price = (100 + fuel) * 0.9;
        } else if ("Sunday".equals(day)) {
            price = (100 + fuel) * 0.8;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        if (budget >= price) {
            output = String.format("Safari time! Money left: %s lv.",
                    decimalFormat.format(budget - price));
        } else {
            output = String.format("Not enough money! Money needed: %s lv.",
                    decimalFormat.format(price - budget));

        }
        System.out.println(output);


    }
}

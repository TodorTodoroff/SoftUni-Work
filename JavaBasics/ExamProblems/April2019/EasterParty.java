package ExamProblems.April2019;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        String output = "";
        budget *= 0.90;

        if (guests >= 10 && guests <= 15) {
            price *= 0.85;

        } else if (guests <= 20 && guests >16) {
            price *= 0.80;

        } else if (guests > 21) {
            price *= 0.75;

        }
        price *= guests;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        if (price <= budget) {
            output = String.format("It is party time! %s leva left.",
                    decimalFormat.format(budget - price));
        } else {
            output = String.format("No party! %s leva needed.",
                    decimalFormat.format(price - budget));
        }
        System.out.println(output);


    }
}

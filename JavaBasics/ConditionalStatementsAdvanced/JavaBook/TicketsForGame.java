package ConditionalStatementsAdvanced.JavaBook;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TicketsForGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal budget = new BigDecimal(scanner.nextLine());
        String tickets = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        BigDecimal price = new BigDecimal("249.99").multiply(new BigDecimal(people));
        BigDecimal discount = new BigDecimal("0.00");
        BigDecimal total = new BigDecimal("0.00");


        if ("VIP".equals(tickets)) {
            price = BigDecimal.valueOf(499.99).multiply(new BigDecimal(people));
        }
        if (people >= 1 && people <= 4) {
            discount = BigDecimal.valueOf(0.75).multiply(budget);
        } else if (people <= 9) {
            discount = BigDecimal.valueOf(0.60).multiply(budget);
        } else if (people <= 24) {
            discount = BigDecimal.valueOf(0.50).multiply(budget);
        } else if (people <= 49) {
            discount = BigDecimal.valueOf(0.40).multiply(budget);
        } else {
            discount = BigDecimal.valueOf(0.25).multiply(budget);
        }

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        total = budget.subtract(discount.add(price));
        String output = String.format("Yes! You have %s leva left.",
                decimalFormat.format(total));

        if (total.compareTo(BigDecimal.valueOf(0)) < 0) {
            output = String.format("Not enough money! You need %s leva.",
                    decimalFormat.format(total.abs()));
        }
        System.out.println(output);
    }
}

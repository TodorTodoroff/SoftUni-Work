package ConditionalStatementsAdvanced.Lab;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Journey2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal budget = new BigDecimal(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String holiday = "";
        BigDecimal cost = new BigDecimal(0.00);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        if (budget.compareTo(BigDecimal.valueOf(100.00)) <= 0) {
            destination = "Bulgaria";
            if ("summer".equals(season)) {
                cost =  BigDecimal.valueOf(0.30).multiply(budget);
                holiday = String.format("Camp - %s",
                        decimalFormat.format(cost));
            } else {
                cost = BigDecimal.valueOf(0.70).multiply(budget);
                holiday = String.format("Hotel - %s",
                        decimalFormat.format(cost));
            }

        } else if (budget.compareTo(BigDecimal.valueOf(1000.00)) <= 0) {
            destination = "Balkans";
            if ("summer".equals(season)) {
                cost = BigDecimal.valueOf(0.40).multiply(budget);
                holiday = String.format("Camp - %s",
                        decimalFormat.format(cost));
            } else {
                cost = BigDecimal.valueOf(0.80).multiply(budget);
                holiday = String.format("Hotel - %s",
                        decimalFormat.format(cost));
            }
        } else {
            destination = "Europe";
            cost = BigDecimal.valueOf(0.90).multiply(budget);
            holiday = String.format("Hotel - %s",
                    decimalFormat.format(cost));
        }
        System.out.printf("Somewhere in %s%n", destination);

        System.out.println(holiday);

    }
}

package ExamProblems.May2019;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Mobileoperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contract = scanner.nextLine();
        String type = scanner.nextLine();
        String internet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double price = 0;
        String output = "";

        switch (contract) {
            case "one":
                switch (type) {
                    case "Small":
                        price = 9.98;
                        break;
                    case "Middle":
                        price = 18.99;
                        break;
                    case "Large":
                        price = 25.98;
                        break;
                    case "ExtraLarge":
                        price = 35.99;
                        break;
                }
                break;
            case "two":
                switch (type) {
                    case "Small":
                        price = 8.58;
                        break;
                    case "Middle":
                        price = 17.09;
                        break;
                    case "Large":
                        price = 23.59;
                        break;
                    case "ExtraLarge":
                        price = 31.79;
                        break;
                }

                break;

        }
        switch (internet) {
            case "yes":
                if (price <= 10.00 && price > 0) {
                    price += 5.5;
                } else if (price <= 30.00 && price > 10.00) {
                    price += 4.35;
                } else if (price > 30.00) {
                    price += 3.85;
                }
                break;
            default:
                break;

        }
        if ("two".equals(contract)) {
            price *= 0.9625;

        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        output = String.format("%s lv.",
                decimalFormat.format(price*months));

        System.out.println(output);


    }
}

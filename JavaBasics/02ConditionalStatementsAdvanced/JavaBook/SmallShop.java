package ConditionalStatementsAdvanced.JavaBook;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double qantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if ("Sofia".equals(city)) {
            if ("coffee".equals(product)) {
                price = qantity * 0.5;
            } else if ("water".equals(product)) {
                price = qantity * 0.8;
            } else if ("beer".equals(product)) {
                price = qantity * 1.2;
            } else if ("sweets".equals(product)) {
                price = qantity * 1.45;
            } else if ("peanuts".equals(product)) {
                price = qantity * 1.6;
            }

        } else if ("Plovdiv".equals(city)) {
            if ("coffee".equals(product)) {
                price = qantity * 0.4;
            } else if ("water".equals(product)) {
                price = qantity * 0.7;
            } else if ("beer".equals(product)) {
                price = qantity * 1.15;
            } else if ("sweets".equals(product)) {
                price = qantity * 1.3;
            } else if ("peanuts".equals(product)) {
                price = qantity * 1.5;
            }

        } else if ("Varna".equals(city)) {
            if ("coffee".equals(product)) {
                price = qantity * 0.45;
            } else if ("water".equals(product)) {
                price = qantity * 0.7;
            } else if ("beer".equals(product)) {
                price = qantity * 1.1;
            } else if ("sweets".equals(product)) {
                price = qantity * 1.35;
            } else if ("peanuts".equals(product)) {
                price = qantity * 1.55;
            }

        }
        System.out.println(price);

    }
}

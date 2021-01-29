package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flower = scan.nextLine();
        int amount = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double price = 0.0;
        double finalPrice = 0.0;

        switch (flower) {
            case "Roses":
                price = 5.00;
                finalPrice = amount * price;
                if (amount > 80) {
                    finalPrice *= 0.90;
                }
                break;
            case "Dahlias":
                price = 3.80;
                finalPrice = amount * price;
                if (amount > 90) {
                    finalPrice *= 0.85;
                }
                break;
            case "Tulips":
                price = 2.80;
                finalPrice = amount * price;
                if (amount > 80) {
                    finalPrice *= 0.85;
                }
                break;
            case "Narcissus":
                price = 3.00;
                finalPrice = amount * price;
                if (amount < 120) {
                    finalPrice *= 1.15;
                }
                break;
            case "Gladiolus":
                price = 2.50;
                finalPrice = amount * price;
                if (amount < 80) {
                    finalPrice *= 1.20;
                }
                break;
        }
        if (finalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amount, flower, budget - finalPrice);
        } else if (finalPrice > budget) {
            System.out.printf("Not enough money, you need %.2f leva more.", finalPrice - budget);
        }
    }
}

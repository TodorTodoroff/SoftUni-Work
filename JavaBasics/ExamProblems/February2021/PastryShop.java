package February2021;

import java.util.Scanner;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int numberProducts = Integer.parseInt(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());

        double totalPrice = numberProducts;

        switch (product) {
            case "Cake":
                if (day <= 15) {
                    totalPrice *= 24;
                } else {
                    totalPrice *= 28.70;
                }
                break;
            case "Souffle":
                if (day <= 15) {
                    totalPrice *= 6.66;
                } else {
                    totalPrice *= 9.80;
                }
                break;

            case "Baklava":
                if (day <= 15) {
                    totalPrice *= 12.60;
                } else {
                    totalPrice *= 16.98;
                }
                break;
        }

        if (day <= 22) {
            if (totalPrice >= 100 && totalPrice <= 200) {
                totalPrice *= 0.85;
            } else if (totalPrice > 200) {
                totalPrice *= 0.75;
            }
            if (day <= 15) {
                totalPrice *= 0.90;
            }
        }
        System.out.printf("%.2f", totalPrice);
    }
}

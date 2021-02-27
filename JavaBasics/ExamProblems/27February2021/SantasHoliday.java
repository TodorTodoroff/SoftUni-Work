package FinalFebruary2021;

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeHotel = scanner.nextLine();
        String opinion = scanner.nextLine();

        days -= 1;

        double totalPrice = days;

        switch (typeHotel) {
            case "room for one person":
                totalPrice *= 18;

                break;
            case "apartment":
                totalPrice *= 25;
                if (days < 10) {
                    totalPrice *= 0.7;
                } else if (days > 10 && days < 15) {
                    totalPrice *= 0.65;
                } else {
                    totalPrice *= 0.5;
                }

                break;
            case "president apartment":
                totalPrice *= 35;
                if (days < 10) {
                    totalPrice *= 0.9;
                } else if (days > 10 && days < 15) {
                    totalPrice *= 0.85;
                } else {
                    totalPrice *= 0.80;
                }
                break;
        }
        if ("positive".equals(opinion)) {
            totalPrice = totalPrice + totalPrice * 0.25;
        } else {
            totalPrice *= 0.9;
        }
        System.out.printf("%.2f", totalPrice);
    }
}

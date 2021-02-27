package FinalFebruary2021;

import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rollsGiftPaper = Integer.parseInt(scanner.nextLine());
        int rollsFabric = Integer.parseInt(scanner.nextLine());
        double glueLiters = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double giftPaperPrice = 5.8 * rollsGiftPaper;
        double fabricPrice = 7.2 * rollsFabric;
        double gluePrice = 1.2 * glueLiters;


        double totalMoney = (giftPaperPrice + fabricPrice + gluePrice) * ((100 - (double)discount)/100);

        System.out.printf("%.3f", totalMoney);
    }
}

package FinalFebruary2021;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double partyPrice = Double.parseDouble(scanner.nextLine());
        int wishesCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int keyholders = Integer.parseInt(scanner.nextLine());
        int drawings = Integer.parseInt(scanner.nextLine());
        int surprise = Integer.parseInt(scanner.nextLine());

        double wishesPrice = wishesCount * 0.6;
        double rosesPrice = rosesCount * 7.2;
        double keyholderPrice = keyholders * 3.6;
        double drawingPrice = drawings * 18.20;
        double surpricePrice = surprise * 22;

        double totalCount = wishesCount + rosesCount + keyholders + drawings + surprise;
        double totalPrice = wishesPrice + rosesPrice + keyholderPrice + drawingPrice + surpricePrice;

        if (totalCount >= 25) {
            totalPrice *= 0.65;
        }
        totalPrice *= 0.9;

        if (totalPrice > partyPrice ){
            System.out.printf("Yes! %.2f lv left.", totalPrice - partyPrice);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", partyPrice - totalPrice);
        }

    }
}

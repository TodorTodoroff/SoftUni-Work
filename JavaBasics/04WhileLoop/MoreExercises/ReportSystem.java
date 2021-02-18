package MoreExercises;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededMoney = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 0;
        double cash = 0;
        double card = 0;
        int total = 0;
        int cashcounter = 0;
        int cardcounter = 0;


        while (!input.equals("End")) {
            int currentMoney = Integer.parseInt(input);
            counter++;

            if (counter % 2 != 0) {
                if (currentMoney > 100) {
                    System.out.printf("Error in transaction!%n");

                } else {
                    cash += currentMoney;
                    total += currentMoney;
                    cashcounter++;
                    System.out.printf("Product sold!%n");
                }

            } else {
                if (currentMoney <= 10) {
                    System.out.printf("Error in transaction!%n");
                } else {
                    card += currentMoney;
                    total += currentMoney;
                    cardcounter++;
                    System.out.printf("Product sold!%n");
                }

            }
            if (total >= neededMoney){
                break;
            }
            input = scanner.nextLine();


        }
        double avgCash = cash / cashcounter;
        double avgCard = card / cardcounter;

        if (total >= neededMoney) {
            System.out.printf("Average CS: %.2f%n" +
                    "Average CC: %.2f%n", avgCash, avgCard);
        } else {
            System.out.printf("Failed to collect required money for charity.");
        }

    }
}

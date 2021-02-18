package Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyTrip = Double.parseDouble(scanner.nextLine());
        double moneyAtHand = Double.parseDouble(scanner.nextLine());

        int counter = 0;
        int counterSpend = 0;

        while (moneyTrip > moneyAtHand && counterSpend < 5) {
            String action = scanner.nextLine();
            double saved = Double.parseDouble(scanner.nextLine());
            counter++;
            if ("save".equals(action)) {
                moneyAtHand += saved;
                counterSpend = 0;
            } else {
                moneyAtHand -= saved;
                counterSpend++;

                if (moneyAtHand < 0) {
                    moneyAtHand = 0;

                }
            }
        }
        if (counterSpend == 5){
            System.out.printf("You can't save the money.%n" +
                    "%d",counter);
        }else {
            System.out.printf("You saved the money for %d days.",counter);
        }
    }
}

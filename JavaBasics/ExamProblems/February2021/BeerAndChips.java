package February2021;

import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beerBottles = Integer.parseInt(scanner.nextLine());
        int chipsPackets = Integer.parseInt(scanner.nextLine());

        double beerPrice = beerBottles * 1.2;
        double chipsPrice = Math.ceil((beerPrice * 0.45) * chipsPackets);
        double totalPrice = beerPrice + chipsPrice;

        if (totalPrice <= budget) {
            System.out.printf("%s bought a snack and has %.2f leva left.",
                    name, budget - totalPrice);
        } else {
            System.out.printf("%s needs %.2f more leva!",
                    name, totalPrice - budget);
        }


    }
}

package Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double savedMoney = 0;

        while (!command.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());

            while (budget > savedMoney) {
                double currentSavings = Double.parseDouble(scanner.nextLine());
                savedMoney += currentSavings;
            }
            if (savedMoney >= budget) {
                System.out.printf("Going to %s!%n", command);
                savedMoney = 0;
            }
            command = scanner.nextLine();
        }
    }
}

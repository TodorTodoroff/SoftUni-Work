package February2021;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int food = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        food *= 1000;

        while (!command.equals("Adopted")) {
            int dalyFood = Integer.parseInt(command);

            food -= dalyFood;

            command = scanner.nextLine();
        }
        if (food >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.", food);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(food));
        }

    }
}

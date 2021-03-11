package MoreExercises;

import java.util.Scanner;

public class GamingStore03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        String output;
        double totalSpent = balance;

        while (!command.equals("Game Time")) {
            switch (command) {
                case "OutFall 4":
                    if (balance >= 39.99) {
                        output = "Bought OutFall 4";
                        balance -= 39.99;
                    } else {
                        output = "Too Expensive";
                    }
                    if (balance <= 0) {
                        System.out.println("Out of money!");
                        return;
                    }
                    break;
                case "CS: OG":
                    if (balance >= 15.99) {
                        output = "Bought CS: OG";
                        balance -= 15.99;
                    } else {
                        output = "Too Expensive";
                    }
                    if (balance <= 0) {
                        System.out.println("Out of money!");
                        return;
                    }
                    break;
                case "Zplinter Zell":
                    if (balance >= 19.99) {
                        output = "Bought Zplinter Zell";
                        balance -= 19.99;
                    } else {
                        output = "Too Expensive";
                    }
                    if (balance <= 0) {
                        System.out.println("Out of money!");
                        return;
                    }
                    break;
                case "Honored 2":

                    if (balance >= 59.99) {
                        output = "Bought Honored 2";
                        balance -= 59.99;
                    } else {
                        output = "Too Expensive";
                    }
                    if (balance <= 0) {
                        System.out.println("Out of money!");
                        return;
                    }
                    break;
                case "RoverWatch":
                    if (balance >= 29.99) {
                        output = "Bought RoverWatch";
                        balance -= 29.99;
                    } else {
                        output = "Too Expensive";
                    }
                    if (balance <= 0) {
                        System.out.println("Out of money!");
                        return;
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (balance >= 39.99) {
                        output = "Bought RoverWatch Origins Edition";
                        balance -= 39.99;
                    } else {
                        output = "Too Expensive";
                    }
                    if (balance <= 0) {
                        System.out.println("Out of money!");
                        return;
                    }
                    break;
                default:
                    output = "Not Found";
                    break;
            }
            System.out.println(output);
            command = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent - balance, balance);

    }
}

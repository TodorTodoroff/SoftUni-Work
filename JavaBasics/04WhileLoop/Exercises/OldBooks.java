package Exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        String input = scanner.nextLine();
        int counter = 0;

        while (!input.equals(book) && !input.equals("No More Books")) {
            counter++;
            input = scanner.nextLine();
        }
        if (input.equals(book)) {
            System.out.printf("You checked %d books and found it.", counter);
        } else {
            System.out.printf("The book you search is not here!%n" +
                    "You checked %d books.", counter);
        }
    }
}

package FinalFebruary2021;

import java.util.Scanner;

public class Excursion_Sale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sea = Integer.parseInt(scanner.nextLine());
        int mountain = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int sum = 0;

        while (!"Stop".equals(command) && (sea > 0 || mountain > 0)) {
            if (command.equals("sea") && sea > 0) {
                sum += 680;
                sea--;

            } else if (command.equals("mountain") && mountain > 0) {
                sum += 499;
                mountain--;

            }
            command = scanner.nextLine();
        }
        if (mountain == 0 && sea == 0) {
            System.out.print("Good job! Everything is sold.\n");
        }
        System.out.printf("Profit: %d leva.", sum);

    }
}

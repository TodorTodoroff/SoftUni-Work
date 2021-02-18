package Lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double total = 0;

        while (!input.equals("NoMoreMoney")) {
            double sum = Double.parseDouble(input);

            if (sum < 0){
                System.out.printf("Invalid operation!%n");
                break;
            }

            total += sum;
            System.out.printf("Increase: %.2f\n", sum);
            input = scanner.nextLine();

        }
        System.out.printf("Total: %.2f",total);
    }
}

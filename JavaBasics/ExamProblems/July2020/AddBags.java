package July2020;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceSuitcase = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());
        int daysUntillFlight = Integer.parseInt(scanner.nextLine());
        int bags = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        if (weight < 10) {
            totalPrice = 0.2 * priceSuitcase;
        } else if (weight <= 20 && weight >= 10) {
            totalPrice = 0.5 * priceSuitcase;

        } else {
            totalPrice = priceSuitcase;
        }
        if (daysUntillFlight < 7) {
            totalPrice += totalPrice * 0.4;
        } else if (daysUntillFlight <= 30) {
            totalPrice += totalPrice * 0.15;
        } else {
            totalPrice += totalPrice * 0.1;
        }
        System.out.printf("The total price of bags is: %.2f lv.", totalPrice * bags);
    }
}

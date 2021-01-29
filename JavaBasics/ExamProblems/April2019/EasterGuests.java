package ExamProblems.April2019;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        String output = "";

        double kozunak = Math.ceil((double) guests / 3);
        double eggs = (guests * 2);
        double price = kozunak * 4 + eggs * 0.45;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        if (price <= budget) {
            output = String.format("Lyubo bought %.0f Easter bread and %.0f eggs.%n" +
                            "He has %s lv. left.",
                    kozunak, eggs, decimalFormat.format(budget - price));

        } else {
            output = String.format("Lyubo doesn't have enough money.%nHe needs %s lv. more.",
                    decimalFormat.format(price - budget));
        }
        System.out.println(output);


    }
}

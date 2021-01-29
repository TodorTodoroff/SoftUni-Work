package ExamProblems.May2019;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegeterian = Integer.parseInt(scanner.nextLine());

        double menuprice = chicken * 10.35 + fish * 12.40 + vegeterian * 8.15;
        double total = menuprice + menuprice * 0.2 + 2.5;

        System.out.printf("Total: %.2f", total);

    }
}

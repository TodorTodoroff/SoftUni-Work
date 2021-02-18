package MoreExercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double l1 = 0;
        double l2 = 0;
        double l3 = 0;
        double totalLoad = 0;

        for (int i = 0; i < n; i++) {

            int load = Integer.parseInt(scanner.nextLine());
            totalLoad += load;
            if (load <= 3) {
                price += 200 * load;
                l1 += load;
            } else if (load <= 11) {
                price += 175 * load;
                l2 += load;
            } else {
                price += 120 * load;
                l3 += load;
            }

        }
        double avgPrice = price / totalLoad;
        double p1 = (l1 / totalLoad) * 100;
        double p2 = (l2 / totalLoad) * 100;
        double p3 = (l3 / totalLoad) * 100;

        System.out.printf("%.2f\n%.2f%%\n%.2f%%\n%.2f%%",
                avgPrice, p1, p2, p3);
    }
}

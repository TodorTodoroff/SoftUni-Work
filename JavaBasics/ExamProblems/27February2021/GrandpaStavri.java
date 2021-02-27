package FinalFebruary2021;

import java.util.Scanner;

public class GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double totalLiters = 0;
        double totalDegrees = 0;

        for (int i = 1; i <= n; i++) {
            double rakiaLiters = Double.parseDouble(scanner.nextLine());
            double alcoholCount = Double.parseDouble(scanner.nextLine());
            totalLiters += rakiaLiters;
            double currentDegrees = rakiaLiters * alcoholCount;
            totalDegrees += currentDegrees;


        }

        totalDegrees /= totalLiters;

        System.out.printf("Liter: %.2f%n", totalLiters);
        System.out.printf("Degrees: %.2f%n", totalDegrees);

        if (totalDegrees < 38) {
            System.out.print("Not good, you should baking!");

        } else if (totalDegrees > 38 && totalDegrees < 42) {

            System.out.print("Super!");
        } else {
            System.out.print("Dilution with distilled water!");

        }

    }
}

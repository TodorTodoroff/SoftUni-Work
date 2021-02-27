package February2021;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double income = 0;

        for (int i = 1; i <= n; i++) {
            double expectedIncome = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            for (int j = 1; j <= days; j++) {
                double dailyIncome = Double.parseDouble(scanner.nextLine());
                income += dailyIncome;

            }
            double avgIncome = income / days;
            if (avgIncome >= expectedIncome) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", avgIncome);
            } else {
                System.out.printf("You need %.2f gold.%n", expectedIncome - avgIncome);
            }
            income = 0;

        }
    }
}

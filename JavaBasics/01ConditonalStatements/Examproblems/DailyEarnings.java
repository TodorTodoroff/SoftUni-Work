package conditionalstatementstraining.Examproblems;

import java.util.Scanner;

public class DailyEarnings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double wages = Double.parseDouble(scanner.nextLine());
        double USD = Double.parseDouble(scanner.nextLine());

        double yearlyincome = (days * wages) * 14.5;
        double tax = yearlyincome * 0.75;
        double dailywageBGN = (tax * USD) / 365;

        System.out.printf("%.2f", dailywageBGN);

    }
}

package July2020;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String companyName = scanner.nextLine();
        int adult = Integer.parseInt(scanner.nextLine());
        int children = Integer.parseInt(scanner.nextLine());
        double adultPrice = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double childrenPrice = children * (adultPrice * 0.3 + tax);
        adultPrice = adult * (adultPrice + tax);
        double profit = (adultPrice + childrenPrice) * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", companyName, profit);


    }
}

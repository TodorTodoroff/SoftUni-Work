package conditionalstatementstraining.Examproblems.lab;

import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fueltype = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        double gasoline = 2.22;
        double diesel = 2.33;
        double gas = 0.93;
        double totalprice = 0;

        if (card.equals("Yes")) {
            gasoline = 2.04;
            diesel = 2.21;
            gas = 0.85;
        }
        if (fueltype.equals("Gasoline")) {
            totalprice = gasoline * liters;

        } else if (fueltype.equals("Diesel")) {
            totalprice = diesel * liters;

        } else if (fueltype.equals("Gas")) {
            totalprice = gas * liters;
        }
        if (liters >= 20 && liters <= 25) {
            totalprice *= 0.92;

        } else if (liters > 25) {
            totalprice *= 0.9;
        }
        System.out.printf("%.2f lv.", totalprice);

    }
}

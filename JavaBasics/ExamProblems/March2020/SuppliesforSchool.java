package ExamProblems.March2020;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        double detergent = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double total = (pens * 5.8 + markers * 7.20 + detergent * 1.2) -
                (pens * 5.8 + markers * 7.20 + detergent * 1.2) * ((double) discount / 100);

        DecimalFormat decimalFormat = new DecimalFormat("0.000");

        System.out.println(decimalFormat.format(total));

    }
}

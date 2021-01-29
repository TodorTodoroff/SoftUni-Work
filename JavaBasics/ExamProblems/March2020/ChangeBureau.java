package ExamProblems.March2020;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double juan = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        bitcoin *= 1168;
        juan = (0.15 * juan) * 1.76;

        double euro = (bitcoin + juan) / 1.95;
        double total = euro - (euro * (tax / 100));

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println(decimalFormat.format(total));

    }
}

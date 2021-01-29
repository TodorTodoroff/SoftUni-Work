package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double result = 0;

        if (sales >= 0 && sales <= 500) {
            if ("Sofia".equals(town)) {
                result = sales - sales * 0.95;
                System.out.printf("%.2f", result);
            } else if ("Varna".equals(town)) {
                result = sales - sales * 0.955;
                System.out.printf("%.2f", result);
            } else if ("Plovdiv".equals(town)) {
                result = sales - sales * 0.945;
                System.out.printf("%.2f", result);
            } else {
                System.out.println("error");
            }
        } else if (sales > 500 && sales <= 1000) {
            if ("Sofia".equals(town)) {
                result = sales - sales * 0.93;
                System.out.printf("%.2f", result);
            } else if ("Varna".equals(town)) {
                result = sales - sales * 0.925;
                System.out.printf("%.2f", result);
            } else if ("Plovdiv".equals(town)) {
                result = sales - sales * 0.92;
                System.out.printf("%.2f", result);
            } else {
                System.out.println("error");
            }
        } else if (sales > 1000 && sales <= 10000) {
            if ("Sofia".equals(town)) {
                result = sales - sales * 0.92;
                System.out.printf("%.2f", result);
            } else if ("Varna".equals(town)) {
                result = sales - sales * 0.90;
                System.out.printf("%.2f", result);
            } else if ("Plovdiv".equals(town)) {
                result = sales - sales * 0.88;
                System.out.printf("%.2f", result);
            } else {
                System.out.println("error");
            }
        } else if (sales > 10000) {
            if ("Sofia".equals(town)) {
                result = sales - sales * 0.88;
                System.out.printf("%.2f", result);
            } else if ("Varna".equals(town)) {
                result = sales - sales * 0.87;
                System.out.printf("%.2f", result);
            } else if ("Plovdiv".equals(town)) {
                result = sales - sales * 0.855;
                System.out.printf("%.2f", result);
            } else {
                System.out.println("error");
            }


        }else {
            System.out.println("error");

        }
    }
}



package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class PointonRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean border = (x == x1 || x == x2) && (y >= y1 && y <= y2) || ((y == y1 || y == y2) && (x >= x1 && x <= x2));

        if (border) {
            System.out.printf("Border");
        } else {
            System.out.printf("Inside / Outside");
        }
    }
}

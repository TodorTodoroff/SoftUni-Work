package conditionalstatementstraining.Examproblems;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        if ("mm".equals(input)) {
            num /= 1000;
        } else if ("cm".equals(input)) {
            num /= 100;
        } else if ("mi".equals(input)) {
            num /= 0.000621371192;
        } else if ("in".equals(input)) {
            num /= 39.3700787;
        } else if ("km".equals(input)) {
            num /= 0.001;
        } else if ("ft".equals(input)) {
            num /= 3.2808399;
        } else if ("yd".equals(input)) {
            num /= 1.0936133;
        }
        if ("mm".equals(output)) {
            num *= 1000;
        } else if ("cm".equals(output)) {
            num *= 100;
        } else if ("mi".equals(output)) {
            num *= 0.000621371192;
        } else if ("in".equals(output)) {
            num *= 39.3700787;
        } else if ("km".equals(output)) {
            num *= 0.001;
        } else if ("ft".equals(output)) {
            num *= 3.2808399;
        } else if ("yd".equals(output)) {
            num *= 1.0936133;
        }
        System.out.println(num);

    }
}

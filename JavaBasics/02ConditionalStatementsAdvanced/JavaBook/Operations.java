package ConditionalStatementsAdvanced.JavaBook;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        BigDecimal result = new BigDecimal("0.00");
        String output = "";
        DecimalFormat intdecimalformat = new DecimalFormat("0");

        if (n2 == 0 && ("/".equals(operator) || "%".equals(operator))) {
            output = String.format("Cannot divide %d by zero", n1);

        } else if ("/".equals(operator)) {
            result = new BigDecimal(n1).divide(
                    new BigDecimal(n2),2,RoundingMode.HALF_UP);
            DecimalFormat decimalformat = new DecimalFormat("0.00");
            output = String.format("%d %s %d = %s",
                    n1, operator, n2, decimalformat.format(result));
        } else if ("%".equals(operator)) {
            result = new BigDecimal(n1).remainder(new BigDecimal(n2));
            output = String.format("%d %s %d = %s",
                    n1, operator, n2, intdecimalformat.format(result));
        } else {
            if ("+".equals(operator)) {
                result = new BigDecimal(n1 + n2);
            } else if ("-".equals(operator)) {
                result = new BigDecimal(n1 - n2);

            } else if ("*".equals(operator)) {
                result = new BigDecimal(n1 * n2);
            }
            output = String.format("%d %s %d = %s - %s",
                    n1, operator, n2,
                    intdecimalformat.format(result),
                    result.intValueExact() % 2 == 0 ? "even" : "odd");
        }

        System.out.println(output);


    }
}

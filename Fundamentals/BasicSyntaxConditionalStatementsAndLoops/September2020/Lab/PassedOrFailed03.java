package BasicSyntaxConditionalStatementsAndLoops.September2020.Lab;

import java.util.Scanner;

public class PassedOrFailed03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        String output;
        if (grade >= 3.00) {
            output = "Passed!";
        } else {
            output = "Failed!";
        }
        System.out.println(output);

    }
}

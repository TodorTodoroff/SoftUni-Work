package BasicSyntaxConditionalStatementsAndLoops.September2020.Lab;

import java.util.Scanner;

public class SumOfOddNumbers09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sumOfAllOddNumbers = 0;

        for (int i = 1; i < n+n;i++) {
            if (i %2 != 0) {
                sumOfAllOddNumbers += i;
                System.out.println(i);
            }

        }
        System.out.println("Sum: " + sumOfAllOddNumbers);

    }
}

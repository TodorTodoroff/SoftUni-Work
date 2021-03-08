package BasicSyntaxConditionalStatementsAndLoops.September2020.Lab;

import java.util.Scanner;

public class MultiplicationTable10 {
    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", n, i, n * i);
        }

    }
}

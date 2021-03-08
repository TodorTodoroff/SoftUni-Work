package BasicSyntaxConditionalStatementsAndLoops.September2020.Lab;

import java.util.Scanner;

public class EvenNumber13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        while (n % 2 != 0) {
            System.out.printf("Please write an even number.%n");
            n = scanner.nextInt();
        }
        System.out.printf("The number is: %d%n", Math.abs(n));


    }
}

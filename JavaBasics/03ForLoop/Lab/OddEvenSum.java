package Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int oddsum = 0;
        int evensum = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (i % 2 != 0) {
                oddsum += num;
            } else {
                evensum += num;
            }

        }
        if (oddsum == evensum) {
            System.out.printf("Yes%n Sum = %d", oddsum);
        } else {
            System.out.printf("No%n Diff = %d", Math.abs(oddsum - evensum));
        }
    }
}

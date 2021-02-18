package Exercise;

import java.util.Scanner;

public class OddOrEvenPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double oddMin = Double.POSITIVE_INFINITY;
        double oddMax = Double.NEGATIVE_INFINITY;
        double evenMin = Double.POSITIVE_INFINITY;
        double evenMax = Double.NEGATIVE_INFINITY;
        double oddSum = 0;
        double evenSum = 0;

        for (int i = 1; i <= n; i++) {
            double n1 = Double.parseDouble(scanner.nextLine());

            if (i % 2 != 0) {
                oddSum += n1;

                if (n1 > oddMax) {
                    oddMax = n1;
                }
                if (n1 < oddMin) {
                    oddMin = n1;
                }
            } else {
                evenSum += n1;

                if (n1 > evenMax) {
                    evenMax = n1;
                }
                if (n1 < evenMin) {
                    evenMin = n1;
                }

            }

        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddSum == 0) {
            System.out.printf("OddMin=No,%nOddMax=No,%n");
        } else {
            System.out.printf("OddMin=%.2f,%nOddMax=%.2f,%n", oddMin, oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenSum == 0) {
            System.out.printf("EvenMin=No,%nEvenMax=No");
        } else {
            System.out.printf("EvenMin=%.2f,%nEvenMax=%.2f", evenMin, evenMax);
        }


    }
}

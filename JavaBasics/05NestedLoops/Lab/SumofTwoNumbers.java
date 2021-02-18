package Lab;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intStart = Integer.parseInt(scanner.nextLine());
        int intFinish = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int sum = 0;
        int firstNumber = 0;
        int lastNumber = 0;
        boolean isTrue = false;

        for (int i = intStart; i <= intFinish; i++) {
            for (int j = intStart; j <= intFinish; j++) {
                counter++;
                firstNumber = i;
                lastNumber = j;

                sum = firstNumber + lastNumber;

                if (sum == magicNumber) {
                    isTrue = true;
                    break;
                }

            }
            if (isTrue) {
                break;
            }

        }
        if (isTrue) {
            System.out.printf("Combination N:%d (%d + %d = %d)",
                    counter, firstNumber, lastNumber, sum);
        } else {
            System.out.printf("%d combinations - neither equals %d",
                    counter, magicNumber);
        }

    }
}

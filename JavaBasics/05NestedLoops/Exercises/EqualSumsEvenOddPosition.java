package Exercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= second; i++) {
            String input = String.valueOf(i);
            int evenSum = 0;
            int oddSum = 0;

            for (int j = 0; j < input.length(); j++) {
                int currentDigit = Integer.parseInt(String.valueOf(input.charAt(j)));
                if (j % 2 != 0) {
                    oddSum += currentDigit;
                } else {
                    evenSum += currentDigit;
                }

            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }


        }

    }
}

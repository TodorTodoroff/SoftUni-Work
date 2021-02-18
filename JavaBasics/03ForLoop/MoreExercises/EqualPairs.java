package MoreExercises;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int left = 0;
        int right = 0;
        int counter = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for (int i = 1; i <= n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            if (i % 2 != 0) {
                left = num1 + num2;
                if (left > max) {
                    max = left;
                }

            } else {
                right = num1 + num2;
                if (right < min) {
                    min = right;
                }
            }
            if (left == right) {
                counter++;
            }

        }
        if (counter == n - 1) {
            System.out.printf("Yes, value=%d", left);
        } else {
            System.out.printf("No, maxdiff=%d", Math.abs(min - max));
        }


    }
}

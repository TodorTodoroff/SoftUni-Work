package MoreExercises;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sFirst = Integer.parseInt(scanner.nextLine());
        int sSecond = Integer.parseInt(scanner.nextLine());
        int fFirst = Integer.parseInt(scanner.nextLine());
        int fSecond = Integer.parseInt(scanner.nextLine());

        boolean isPrime = false;
        int counter = 0;

        for (int i = sFirst; i <= (sFirst + fFirst); i++) {
            for (int j = sSecond; j <= (sSecond + fSecond); j++) {
                for (int k = 2; k <= 9; k++) {

                    if (i % k == 0 || j % k == 0) {
                        counter++;
                        break;
                    }

                }
                if (counter == 0) {
                    System.out.printf("%d%d%n", i, j);
                }
                counter = 0;
            }
        }

    }

}



package MoreExercises;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int counterCombination = 0;
        boolean isFirst = false;

        for (int i = start; i <= stop; i++) {
            for (int j = start; j <= stop; j++) {
                counterCombination++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)",
                            counterCombination, i, j, magicNumber);
                    isFirst = true;
                    break;
                }
            }
            if (isFirst) {
                break;
            }

        }if (!isFirst){
            System.out.printf("%d combinations - neither equals %d",
                    counterCombination,magicNumber);
        }


    }


}

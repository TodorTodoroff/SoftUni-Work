package MoreExercises;

import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());

        char A = 35;
        char B = 64;
        int counter = 0;
        boolean isBigger = false;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                counter++;
                if (A > 55) {
                    A = 35;
                }
                if (B > 96) {
                    B = 64;
                }
                if (counter>maxPasswords){
                    isBigger = true;
                    break;
                }

                System.out.printf("%c%c%d%d%c%c|", A, B, i, j, B, A);
                A++;
                B++;

            }
            if (isBigger){
                break;
            }

        }


    }
}

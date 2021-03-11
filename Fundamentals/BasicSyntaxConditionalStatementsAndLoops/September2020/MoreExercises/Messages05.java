package MoreExercises;

import java.util.Scanner;

public class Messages05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            int mainDigit = Integer.parseInt(command) % 10;
            if (mainDigit ==0){
                System.out.print(" ");
                continue;
            }
            int numLeng = command.length();
            int offset = 0;
            if (mainDigit == 8 || mainDigit == 9) {
                offset = (mainDigit - 2) * 3 + 1;
            } else {
                offset = (mainDigit - 2) * 3;
            }
            int letterIndex = (offset + numLeng - 1) + 97;
            System.out.printf("%c", letterIndex);

        }
    }
}

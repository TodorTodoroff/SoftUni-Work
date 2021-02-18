package Exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int wight = Integer.parseInt(scanner.nextLine());

        int pieces = lenght * wight;
        boolean isFinished = false;
        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            int pieceseaten = Integer.parseInt(input);
            pieces -= pieceseaten;
            if (pieces <= 0) {
                isFinished = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isFinished) {
            System.out.printf("No more cake left! You need %d pieces more.",
                    Math.abs(pieces));
        } else {
            System.out.printf("%d pieces are left.", pieces);
        }


    }
}

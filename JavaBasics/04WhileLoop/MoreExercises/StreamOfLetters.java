package MoreExercises;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean oHasOccurred = false, cHasOccurred = false, nHasOccurred = false;

        String text = "";

        while (!input.equals("End")) {
            char letter = input.charAt(0);
            boolean appendLetter = false;

            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                switch (letter) {
                    case 'o':
                        appendLetter = oHasOccurred;
                        oHasOccurred = true;
                        break;
                    case 'c':
                        appendLetter = cHasOccurred;
                        cHasOccurred = true;
                        break;
                    case 'n':
                        appendLetter = nHasOccurred;
                        nHasOccurred = true;
                        break;
                    default:
                        appendLetter = true;
                        break;
                }

            }
            if (appendLetter) {
                text += letter;
            }
            if (nHasOccurred && oHasOccurred && cHasOccurred) {
                System.out.print(text + ' ');
                text = "";
                oHasOccurred = false;
                nHasOccurred = false;
                cHasOccurred = false;

            }
            input = scanner.nextLine();
        }

    }
}

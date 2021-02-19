package July2020;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String start = scanner.nextLine();
        String end = scanner.nextLine();

        for (char i = start.charAt(0); i <= end.charAt(0); i++) {
            for (char j = start.charAt(1); j <= end.charAt(1); j++) {
                for (char k = start.charAt(2); k <= end.charAt(2); k++) {
                    for (char l = start.charAt(3); l <= end.charAt(3); l++) {

                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%c%c%c%c ", i, j, k, l);
                        }

                    }
                }

            }
        }

    }
}

package FinalFebruary2021;

import java.util.Scanner;

public class Substitutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int changeNum = 1;

        for (int i = k; i <= 8; i++) {
            for (int j = 9; j >= l; j--) {
                for (int o = m; o <= 8; o++) {
                    for (int p = 9; p >= n; p--) {
                        if (changeNum <= 6) {
                            if ((i % 2 == 0 && o % 2 == 0) && (j % 2 != 0 && p % 2 != 0)) {
                                if (i == o && j == p) {
                                    System.out.print("Cannot change the same player.\n");
                                } else {
                                    System.out.printf("%d%d - %d%d%n", i, j, o, p);
                                    changeNum++;
                                }

                            }

                        } else {
                            break;
                        }
                    }

                }

            }

        }

    }


}


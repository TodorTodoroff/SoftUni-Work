package FinalFebruary2021;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean isCase1 = false;
        boolean isCase2 = false;
        String number = "";

        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {

                        if ((a + b + c + d) == (a * b * c * d) && n % 10 == 5) {
                            number = String.format("%d%d%d%d", a, b, c, d);
                            isCase1 = true;
                            break;
                        } else if (((a * b * c * d) / (a + b + c + d)) == 3 && n % 3 == 0) {
                            number = String.format("%d%d%d%d", d, c, b, a);
                            isCase2 = true;
                            break;
                        }

                    }
                    if (isCase1 || isCase2) {
                        break;
                    }
                }
                if (isCase1 || isCase2) {
                    break;
                }

            }
            if (isCase1 || isCase2) {
                break;
            }
        }
        if (isCase1 || isCase2) {
            System.out.println(number);
        }else {
            System.out.print("Nothing found");
        }
    }
}
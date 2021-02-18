package Lab;

import java.util.Scanner;

public class Numbersequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int n1 = Integer.parseInt(scanner.nextLine());

            if (n1 > max) {

                max = n1;
            }
            if (n1 < min) {
                min = n1;
            }


        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);


    }
}

package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EvenPowersof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                int num = (int) Math.pow(2, i);

                System.out.println(num);
            }
        }

    }
}

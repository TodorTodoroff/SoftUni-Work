package Exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int n1 = Integer.parseInt(scanner.nextLine());
            sum += n1;
            if (n1 > max) {
                max = n1;
            }

        }
        sum -= max;
        if (max == sum) {
            System.out.printf("Yes%nSum = %d", max);
        } else {
            int diff = Math.abs(max-sum);
            System.out.printf("No%nDiff = %d", diff);
        }

    }
}

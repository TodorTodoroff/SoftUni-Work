package Lab;

import java.util.Scanner;

public class leftrightsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftsum = 0;
        int rightsum = 0;


        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            leftsum += num;
        }
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            rightsum += num;
        }
        if (leftsum == rightsum) {
            System.out.printf("Yes, sum = %d", leftsum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftsum - rightsum));

        }
    }
}

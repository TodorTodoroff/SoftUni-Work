package BasicSyntaxConditionalStatementsAndLoops.September2020.Lab;

import java.util.Scanner;

public class MultiplicationTableSecound11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int multiplayer = scanner.nextInt();

        if (multiplayer > 10) {
            System.out.printf("%d X %d = %d%n", n, multiplayer, n * multiplayer);
        }else {
            for (int i = multiplayer; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", n, i, n * i);
            }
        }

    }
}

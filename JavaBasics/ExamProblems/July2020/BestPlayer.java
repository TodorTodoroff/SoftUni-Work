package July2020;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player = scanner.nextLine();
        int bestScore = 0;
        String bestPlayer = "";

        while (!"END".equals(player)) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (bestScore < goals) {
                bestScore = goals;
                bestPlayer = player;
            }
            if (bestScore >= 10) {
                break;
            }

            player = scanner.nextLine();
        }
        if (bestScore >= 3) {
            System.out.printf("%s is the best player!\n" +
                    "He has scored %d goals and made a hat-trick !!!\n", bestPlayer, bestScore);
        } else {
            System.out.printf("%s is the best player!\n" +
                    "He has scored %d goals.\n", bestPlayer, bestScore);
        }

    }
}

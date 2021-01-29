package conditionalstatementstraining.Examproblems.lab;

import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = Integer.parseInt(scanner.nextLine());
        double bonuspoints = 0;

        if (score % 2 == 0) {
            bonuspoints = 1;

        } else if (score % 5 == 0) {
            bonuspoints = 2;

        }
        if (score <= 100) {
            bonuspoints += 5;

        } else if (score > 100 && score < 1000) {
            bonuspoints += score * 0.2;

        } else if (score > 1000) {
            bonuspoints += score * 0.1;
        }
        System.out.println(bonuspoints);
        System.out.println(bonuspoints + score);


    }
}



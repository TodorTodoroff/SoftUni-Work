package Exercises;

import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String steps = scanner.nextLine();

        int dailyGoal = 0;
        int stepscount = 0;

        while (!"Going home".equals(steps)) {
            stepscount = Integer.parseInt(steps);
            dailyGoal += stepscount;

            if (dailyGoal > 10000) {

                break;
            }
            steps = scanner.nextLine();
        }
        if ("Going home".equals(steps)) {
            stepscount = Integer.parseInt(scanner.nextLine());
            dailyGoal += stepscount;
        }

        if (dailyGoal > 10000) {
            System.out.printf("Goal reached! Good job!%n" +
                    "%d steps over the goal!", dailyGoal - 10000);
        } else {

            System.out.printf("%d more steps to reach goal.", 10000 - dailyGoal);
        }
    }
}

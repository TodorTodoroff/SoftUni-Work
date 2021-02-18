package Exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badResult = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double avgScore = 0;
        int counter = 0;
        int badcounter = 0;
        String lastProblem = "";

        while (!input.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            lastProblem = input;
            avgScore += grade;
            counter++;
            if (grade <= 4) {
                badcounter++;
            }
            if (badcounter >= badResult) {
                System.out.printf("You need a break, %d poor grades.", badResult);
                break;
            }
            input = scanner.nextLine();


        }
        if (badcounter < badResult) {
            System.out.printf("Average score: %.2f%n" +
                            "Number of problems: %d%n" +
                            "Last problem: %s",
                    avgScore / counter,
                    counter,
                    lastProblem);
        }
    }
}

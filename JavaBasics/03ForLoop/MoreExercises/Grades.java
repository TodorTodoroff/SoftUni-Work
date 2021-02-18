package MoreExercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double avgGrade = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;

        for (int i = 0; i < n; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            avgGrade += grade;
            if (grade < 3 && grade >= 2) {
                p1++;
            } else if (grade < 4) {
                p2++;
            } else if (grade < 5) {
                p3++;
            } else {
                p4++;
            }

        }

        System.out.printf("Top students: %.2f%%\n" +
                        "Between 4.00 and 4.99: %.2f%%\n" +
                        "Between 3.00 and 3.99: %.2f%%\n" +
                        "Fail: %.2f%%\n" +
                        "Average: %.2f",
                (p4 / n) * 100,
                (p3 / n) * 100,
                (p2 / n) * 100,
                (p1 / n) * 100,
                avgGrade / n);
    }
}

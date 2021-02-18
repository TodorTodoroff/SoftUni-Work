package Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        double scoreAvg = 0;
        int grade = 1;
        int excluded = 0;

        while (grade <= 12) {
            double num = Double.parseDouble(scanner.nextLine());


            if (num < 4) {
                excluded++;
            } else {
                grade++;
            }
            if (excluded > 1) {

                break;
            }

            scoreAvg += num;

        }
        if (excluded > 1) {
            System.out.printf("%s has been excluded at %d grade", studentName, grade);
        } else {

            scoreAvg /= 12;
            System.out.printf("%s graduated. Average grade: %.2f", studentName, scoreAvg);
        }
    }
}

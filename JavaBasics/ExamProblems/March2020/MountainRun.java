package ExamProblems.March2020;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double seconds = Double.parseDouble(scanner.nextLine());

        double addedtime = Math.floor(distance / 50) * 30;
        double time = distance * seconds + addedtime;

        if (time < record) {

            System.out.printf("Yes! The new record is %.2f seconds.", time);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", time - record);
        }
    }
}

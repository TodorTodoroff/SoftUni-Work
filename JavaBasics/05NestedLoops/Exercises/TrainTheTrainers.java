package Exercises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int members = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double presentAvg = 0;
        double totalAvg = 0;
        int counter = 0;

        while (!input.equals("Finish")) {
            String presentationName = input;
            input = scanner.nextLine();
            for (int i = 0; i < members; i++) {
                double currentGrade = Double.parseDouble(input);
                presentAvg += currentGrade;
                input = scanner.nextLine();
                counter++;
            }
            System.out.printf("%s - %.2f.%n", presentationName, presentAvg / members);
            totalAvg += presentAvg;
            presentAvg = 0;

        }
        System.out.printf("Student's final assessment is %.2f.", totalAvg / counter);


    }


}


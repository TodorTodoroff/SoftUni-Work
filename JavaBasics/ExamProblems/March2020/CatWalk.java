package ExamProblems.March2020;


import java.util.Scanner;

public class CatWalk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int walks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        String output = "";

        int totalcalories = (walks * minutes) * 5;

        if (totalcalories >= calories * 0.5) {
            output = String.format("Yes, the walk for your cat is enough. " +
                    "Burned calories per day: %d.", totalcalories);

        } else {
            output = String.format("No, the walk for your cat is not enough. " +
                    "Burned calories per day: %d.", totalcalories);
        }
        System.out.println(output);
    }
}

package conditionalstatementstraining.Examproblems.lab;

import java.util.Scanner;

public class Scholarship1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //read from console
        double income = Double.parseDouble(scanner.nextLine());
        double avgScore = Double.parseDouble(scanner.nextLine());
        double minWages = Double.parseDouble(scanner.nextLine());

        double social = 0;
        double excellent = 0;
        String output = "";

        //checks
        if (avgScore > 4.5 && income < minWages) {
            social = Math.floor(0.35 * minWages);

        }
        if (avgScore >= 5.50) {
            excellent = Math.floor(avgScore * 25);
        }
        if (social == 0 && excellent == 0) {
            output = "You cannot get a scholarship!";
        } else if (social > excellent) {
            output = String.format("You get a Social scholarship %.0f BGN", social);
        } else {
            output = String.format("You get a scholarship for excellent results %.0f BGN", excellent);
        }
        System.out.println(output);
    }


}



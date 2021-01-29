package conditionalstatementstraining.Examproblems.lab;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodleft = Integer.parseInt(scanner.nextLine());
        double dog = Double.parseDouble(scanner.nextLine());
        double cat = Double.parseDouble(scanner.nextLine());
        double turtle = Double.parseDouble(scanner.nextLine());

        double totalneed = (dog + cat + (turtle / 1000)) * days;

        if (foodleft >= totalneed) {

            System.out.printf("%.0f kilos of food left.",
                    Math.floor(foodleft - totalneed));

        } else {
            System.out.printf("%.0f more kilos of food are needed.",
                    Math.ceil(totalneed - foodleft));
        }


    }
}

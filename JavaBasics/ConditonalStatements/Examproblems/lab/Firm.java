package conditionalstatementstraining.Examproblems.lab;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double workhours = Math.floor(((0.9 * days) * 8) + (days * workers * 2));

        if (hours <= workhours) {
            System.out.printf("Yes!%.0f hours left.",
                    Math.floor(workhours - hours));
        } else {
            System.out.printf("Not enough time!%.0f hours needed.",
                    Math.floor(hours - workhours));
        }
    }
}

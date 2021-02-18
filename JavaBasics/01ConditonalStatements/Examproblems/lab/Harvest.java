package conditionalstatementstraining.Examproblems.lab;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int area = Integer.parseInt(scanner.nextLine());
        double grapes = Double.parseDouble(scanner.nextLine());
        int wineneeded = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double wine = ((area * grapes) * 0.4) / 2.5;

        if (wineneeded > wine) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",
                    Math.floor(wineneeded - wine));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n",
                    Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.",
                    Math.ceil(wine - wineneeded),
                    Math.ceil((wine - wineneeded) / workers));
        }

    }
}

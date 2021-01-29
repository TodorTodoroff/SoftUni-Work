package conditionalstatementstraining.Examproblems.lab;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolia = Integer.parseInt(scanner.nextLine());
        int hyacinth = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double presentpr = Double.parseDouble(scanner.nextLine());

        double magnoliapr = magnolia * 3.25;
        hyacinth *= 4;
        double rosepr = rose * 3.5;
        cactus *= 8;

        double totalsum = (magnoliapr + hyacinth + rosepr + cactus) * 0.95;

        if (presentpr <= totalsum) {
            System.out.printf("She is left with %.0f leva.",
                    Math.floor(totalsum - presentpr));
        } else {
            System.out.printf("She will have to borrow %.0f leva.",
                    Math.ceil(presentpr - totalsum));
        }


    }

}




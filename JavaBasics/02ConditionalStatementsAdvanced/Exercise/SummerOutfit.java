package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String daytime = scanner.nextLine();

        String outfit = "";
        String shirt = "";

        if (degrees <= 18 && degrees >= 10) {
            switch (daytime) {
                case "Morning":
                    outfit = "Sweatshirt";
                    shirt = "Sneakers";
                    break;
                case "Afternoon":
                case "Evening":
                    outfit = "Shirt";
                    shirt = "Moccasins";
                    break;
            }
        } else if (degrees <= 24) {

            switch (daytime) {
                case "Morning":
                case "Evening":
                    outfit = "Shirt";
                    shirt = "Moccasins";
                    break;
                case "Afternoon":
                    outfit = "T-Shirt";
                    shirt = "Sandals";
                    break;

            }

        } else {
            switch (daytime) {
                case "Morning":
                    outfit = "T-Shirt";
                    shirt = "Sandals";
                    break;
                case "Afternoon":
                    outfit = "Swim Suit";
                    shirt = "Barefoot";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shirt = "Moccasins";
                    break;
            }

        }
        System.out.printf("It's %d degrees, get your %s and %s.",degrees, outfit, shirt);
    }
}

package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double price = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                price = (chrysanthemums * 2.00 + roses * 4.10 + tulips * 2.50);
                switch (holiday) {
                    case "Y":
                        price *= 1.15;
                        break;
                }
                break;
            case "Autumn":
            case "Winter":
                price = (chrysanthemums * 3.75 + roses * 4.50 + tulips * 4.15);
                switch (holiday) {
                    case "Y":
                        price *= 1.15;
                        break;
                }

                break;
        }
        if (tulips > 7 && "Spring".equals(season)) {
            price *= 0.95;
        } else if (roses >= 10 && "Winter".equals(season)) {
            price *= 0.9;
        }
        if (roses + chrysanthemums + tulips > 20) {
            price *= 0.80;
        }
        System.out.printf("%.2f", price + 2);


    }
}


package MoreExercises;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int detergentml = bottles * 750;
        int counter = 0;
        int disheswashed = 0;
        int potswashed = 0;

        while (!input.equals("End")) {
            int dishes = Integer.parseInt(input);
            counter++;

            if (counter % 3 == 0) {
                detergentml -= dishes * 15;
                potswashed += dishes;
            } else {
                detergentml -= dishes * 5;
                disheswashed += dishes;
            }

            if (detergentml < 0) {
                break;
            }
            input = scanner.nextLine();

        }
        if (detergentml >= 0) {
            System.out.printf("Detergent was enough!%n" +
                            "%d dishes and %d pots were washed.%n" +
                            "Leftover detergent %d ml.",
                    disheswashed, potswashed, detergentml);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!",
                    Math.abs(detergentml));
        }

    }
}

package February2021;

import java.util.Scanner;

public class catFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int catNum = Integer.parseInt(scanner.nextLine());
        int counterG1 = 0;
        int counterG2 = 0;
        int counterG3 = 0;
        double totalFood = 0;

        for (int i = 1; i <= catNum; i++) {
            double dailyFood = Integer.parseInt(scanner.nextLine());
            totalFood += dailyFood;
            if (dailyFood >= 100 && dailyFood < 200) {
                counterG1++;
            } else if (dailyFood >= 200 && dailyFood < 300) {
                counterG2++;
            } else if (dailyFood >= 300 && dailyFood < 400) {
                counterG3++;
            }
        }
        double foodPrice = (totalFood / 1000) * 12.45;
        System.out.printf("Group 1: %d cats.%n" +
                        "Group 2: %d cats.%n" +
                        "Group 3: %d cats.%n" +
                        "Price for food per day: %.2f lv.",
                counterG1, counterG2, counterG3, foodPrice);

    }
}

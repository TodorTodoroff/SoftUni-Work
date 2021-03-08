package BasicSyntaxConditionalStatementsAndLoops.September2020.Lab;

import java.util.Scanner;

public class TheatrePromotion07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeDay = scanner.nextLine();
        int age = scanner.nextInt();
        String output;
        int price;

        switch (typeDay.toLowerCase()) {
            case "weekday":
                if (0 <= age && age <= 18) {
                    price = 12;
                } else if (18 < age && age <= 64) {
                    price = 18;
                } else if (64 < age && age <= 122) {
                    price = 12;
                } else {
                    price = -1;
                }
                break;
            case "weekend":
                if (0 <= age && age <= 18) {
                    price = 15;
                } else if (18 < age && age <= 64) {
                    price = 20;
                } else if (64 < age && age <= 122) {
                    price = 15;
                } else {
                    price = -1;
                }
                break;
            case "holiday":
                if (0 <= age && age <= 18) {
                    price = 5;
                } else if (18 < age && age <= 64) {
                    price = 12;
                } else if (64 < age && age <= 122) {
                    price = 10;
                } else {
                    price = -1;
                }
                break;
            default:
                price = -1;
                break;
        }
        if (price == -1) {
            output = "Error!";
        } else {
            output = String.valueOf(price + "$");
        }
        System.out.println(output);
    }
}

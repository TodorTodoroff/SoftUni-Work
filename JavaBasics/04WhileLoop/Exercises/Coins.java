package Exercises;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        int counter = 0;
        change *= 100;

        while (change > 0) {

            if (change - 200 >= 0) {
                change = change - 200;
                counter++;
            } else if (change - 100 >= 0) {
                change -= 100;
                counter++;
            } else if (change - 50 >= 0) {
                change = change - 50;
                counter++;
            } else if (change - 20 >= 0) {
                change = change - 20;
                counter++;
            } else if (change - 10 >= 0) {
                change = change - 10;
                counter++;
            } else if (change - 5 >= 0) {
                change = change - 5;
                counter++;
            } else if (change - 2 >= 0) {
                change = change - 2;
                counter++;
            } else if (change - 1 >= 0) {
                change = Math.round(change - 1);
                counter++;

            } else {
                break;
            }


        }
        System.out.println(counter);

    }
}

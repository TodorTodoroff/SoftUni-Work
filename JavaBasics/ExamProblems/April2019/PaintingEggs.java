package ExamProblems.April2019;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String eggsize = scanner.nextLine();
        String eggdiye = scanner.nextLine();
        int eggcount = Integer.parseInt(scanner.nextLine());

        double price = 0;
        String output = "";

        switch (eggdiye) {
            case "Red":
                switch (eggsize) {
                    case "Large":
                        price = eggcount * 16;
                        break;
                    case "Medium":
                        price = eggcount * 13;
                        break;
                    case "Small":
                        price = eggcount * 9;
                        break;
                }
                break;
            case "Green":
                switch (eggsize) {
                    case "Large":
                        price = eggcount * 12;
                        break;
                    case "Medium":
                        price = eggcount * 9;
                        break;
                    case "Small":
                        price = eggcount * 8;
                        break;
                }
                break;
            case "Yellow":
                switch (eggsize) {
                    case "Large":
                        price = eggcount * 9;
                        break;
                    case "Medium":
                        price = eggcount * 7;
                        break;
                    case "Small":
                        price = eggcount * 5;
                        break;
                }
                break;
        }
        price *= 0.65;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        output = String.format("%s leva.",
                decimalFormat.format(price));

        System.out.println(output);
    }
}

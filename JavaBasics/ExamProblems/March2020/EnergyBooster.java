package ExamProblems.March2020;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String size = scanner.nextLine();
        int oredered = Integer.parseInt(scanner.nextLine());

        double totalsum = 0;


        switch (type) {
            case "Watermelon":
                switch (size) {
                    case "small":
                        totalsum = oredered * 2 * 56;
                        break;
                    case "big":
                        totalsum = oredered * 5 * 28.7;
                        break;
                }

                break;
            case "Mango":
                switch (size) {
                    case "small":
                        totalsum = oredered * 2 * 36.66;
                        break;
                    case "big":
                        totalsum = oredered * 5 * 19.6;
                        break;
                }


                break;
            case "Pineapple":

                switch (size) {
                    case "small":
                        totalsum = oredered * 2 * 42.10;
                        break;
                    case "big":
                        totalsum = oredered * 5 * 24.80;
                        break;
                }

                break;
            case "Raspberry":
                switch (size) {
                    case "small":
                        totalsum = oredered * 2 * 20;
                        break;
                    case "big":
                        totalsum = oredered * 5 * 15.20;
                        break;
                }


                break;
        }
        if (totalsum >= 400 && totalsum <= 1000) {
            totalsum *= 0.85;
        } else if (totalsum > 1000) {
            totalsum *= 0.50;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println(decimalFormat.format(totalsum)+" lv.");

    }
}

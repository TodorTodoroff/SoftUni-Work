package ExamProblems.April2019;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        String output = "";

        switch (dates) {
            case "21-23":
                switch (destination) {
                    case "France":
                        price = nights * 30;
                        break;
                    case "Italy":
                        price = nights * 28;
                        break;
                    case "Germany":
                        price = nights * 32;
                        break;
                }
                break;
            case "24-27":
                switch (destination) {
                    case "France":
                        price = nights * 35;
                        break;
                    case "Italy":
                        price = nights * 32;
                        break;
                    case "Germany":
                        price = nights * 37;
                        break;
                }

                break;
            case "28-31":
                switch (destination) {
                    case "France":
                        price = nights * 40;
                        break;
                    case "Italy":
                        price = nights * 39;
                        break;
                    case "Germany":
                        price = nights * 43;
                        break;
                }

                break;

        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        output = String.format("Easter trip to %s : %s leva.",
                destination, decimalFormat.format(price));

        System.out.println(output);
    }
}

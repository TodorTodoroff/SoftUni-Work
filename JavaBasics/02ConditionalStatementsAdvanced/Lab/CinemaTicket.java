package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine().toLowerCase();

        int price = 0;

        switch (day) {
            case "monday":
            case "tuesday":
            case "friday":
                price = 12;
                break;
            case "wednesday":
            case "thursday":
                price = 14;
                break;
            default:
                price = 16;

        }
        System.out.println(price);
    }
}

package conditionalstatementstraining.Examproblems;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int disatnce = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double taxiprice = 0.0;
        double tripprice = 0.0;

        if (dayOrNight.equals("day")) {
            taxiprice = disatnce * 0.79 + 0.7;
        } else {
            taxiprice = disatnce * 0.90 + 0.7;
        }
        if (disatnce < 20) {
            tripprice = taxiprice;
        } else if (disatnce < 100) {
            tripprice = disatnce * 0.09;
        } else {
            tripprice = disatnce * 0.06;
        }
        System.out.printf("%.2f", tripprice);
    }
}

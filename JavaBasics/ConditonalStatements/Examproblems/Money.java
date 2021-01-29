package conditionalstatementstraining.Examproblems;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double juan = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double bitcoinEUR = (bitcoin * 1168) / 1.95;
        juan = ((juan * 0.15) * 1.76) / 1.95 ;

        double EURtotal = (juan + bitcoinEUR) - (juan + bitcoinEUR) * (tax / 100);

        System.out.println(EURtotal);
    }
}

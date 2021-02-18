package Lab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washerPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        
        double sum = 0;
        double money = 0;
        double totalmoney = 0;
        int counter = 0;

        for (int i = 1; i <=age ; i++) {

            if (i %2 == 0){
                money += 10;
                totalmoney =(totalmoney + money) - 1;

            }else {
                counter++;
            }
            
        }
        sum = toyPrice * counter + totalmoney;

        if (sum >= washerPrice){
            System.out.printf("Yes! %.2f", Math.abs(washerPrice - sum));
        }else {
            System.out.printf("No! %.2f", Math.abs(washerPrice - sum));
        }

    }
}

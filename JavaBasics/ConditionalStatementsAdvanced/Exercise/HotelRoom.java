package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double pricestudio = 0;
        double priceapartment = 0;


        switch (month) {
            case "May":
            case "October":
                pricestudio = 50 * nights;
                priceapartment = 65 * nights;
                if (nights > 7 && nights < 14) {
                    pricestudio *= 0.95;
                } else if (nights > 14){
                    pricestudio *= 0.7;
                    priceapartment *= 0.9;
                }


                break;
            case "June":
            case "September":
                pricestudio = 75.20 * nights;
                priceapartment = 68.70 * nights;
                if (nights > 14) {
                    pricestudio *= 0.8;
                    priceapartment *= 0.9;
                }

                break;
            case "July":
            case "August":
                pricestudio = 76 * nights;
                priceapartment = 77 * nights;
                if (nights > 14) {
                    priceapartment *= 0.9;
                }

                break;
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", priceapartment, pricestudio);


    }
}

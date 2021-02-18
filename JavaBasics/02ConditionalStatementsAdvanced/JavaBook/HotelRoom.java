package ConditionalStatementsAdvanced.JavaBook;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        BigDecimal studioprice = new BigDecimal("0.00");
        BigDecimal appartmentprice = new BigDecimal("0.00");
        BigDecimal studiodiscount = new BigDecimal("0.00");
        BigDecimal appartmentdisc = new BigDecimal("0.00");
        String output = "";

        switch (month) {
            case "May":
            case "October":     //Check for month and set prices

                studioprice = new BigDecimal(50).multiply(new BigDecimal(nights));
                appartmentprice = new BigDecimal(65).multiply(new BigDecimal(nights));


                if (nights > 14) {  //Check for discounts over multiple nights spent
                    studioprice = studioprice.multiply(new BigDecimal(0.70));
                    appartmentprice = appartmentprice.multiply(new BigDecimal(0.90));
                } else if (nights > 7) {
                    studioprice = studioprice.multiply(new BigDecimal(0.95));
                }
                break;

            case "June":
            case "September":
                studioprice = new BigDecimal(75.20).multiply(new BigDecimal(nights));
                appartmentprice = new BigDecimal(68.70).multiply(new BigDecimal(nights));

                if (nights > 14) {
                    studioprice = studioprice.multiply(new BigDecimal(0.80));
                    appartmentprice = appartmentprice.multiply(new BigDecimal(0.90));
                }
                break;
            case "July":
            case "August":
                studioprice = new BigDecimal(76).multiply(new BigDecimal(nights));
                appartmentprice = new BigDecimal(77).multiply(new BigDecimal(nights));

                if (nights > 14) {

                    appartmentprice = appartmentprice.multiply(new BigDecimal(0.90));
                }

                break;
            default:
                break;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        String studioinfo = String.format("Studio: %s lv.",
                decimalFormat.format(studioprice));
        String appartmentinfo = String.format("Apartment: %s lv.%n",
                decimalFormat.format(appartmentprice));

        System.out.println(appartmentinfo + studioinfo);
    }
}

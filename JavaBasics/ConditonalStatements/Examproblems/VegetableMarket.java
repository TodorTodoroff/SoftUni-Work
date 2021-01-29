package conditionalstatementstraining.Examproblems;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegetablesprice = Double.parseDouble(scanner.nextLine());
        double fruitprice = Double.parseDouble(scanner.nextLine());
        int vegetablekg = Integer.parseInt(scanner.nextLine());
        int fruitkg = Integer.parseInt(scanner.nextLine());

//        DecimalFormat decimalFormat = new DecimalFormat("#.##########");

        double totalpriceEUR = (vegetablekg * vegetablesprice + fruitkg * fruitprice) / 1.94;
        System.out.println(totalpriceEUR);
    }
}

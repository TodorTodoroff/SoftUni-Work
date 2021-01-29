package ExamProblems.April2019;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flowerprice = Double.parseDouble(scanner.nextLine());
        double flowerkg = Double.parseDouble(scanner.nextLine());
        double shugarkg = Double.parseDouble(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int yeast = Integer.parseInt(scanner.nextLine());

        double shugarprice = 0.75 * flowerprice;
        double yeastprice = 0.2 * shugarprice;
        double eggprice = flowerprice + (flowerprice * 0.1);
        double total = flowerkg * flowerprice + shugarkg * shugarprice + yeastprice * yeast + eggprice * eggs;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println(decimalFormat.format(total));

    }
}

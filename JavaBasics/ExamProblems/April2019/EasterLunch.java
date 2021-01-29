package ExamProblems.April2019;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kozunak = Integer.parseInt(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int cookies = Integer.parseInt(scanner.nextLine());


        double eggprice = (eggs * 12) * 0.15 + eggs * 4.35;
        double total = eggprice + kozunak * 3.2 + cookies * 5.40;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println(decimalFormat.format(total));

    }
}

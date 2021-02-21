package February2021;

import java.util.Scanner;

public class Roompainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paintBucket = Integer.parseInt(scanner.nextLine());
        int wallpaperRolls = Integer.parseInt(scanner.nextLine());
        double glovesPrice = Double.parseDouble(scanner.nextLine());
        double brushPrice = Double.parseDouble(scanner.nextLine());

        double paintPrice = paintBucket * 21.5;
        double wallpaperPrice = wallpaperRolls * 5.2;
        double glovesTotal = Math.ceil(wallpaperRolls * 0.35) * glovesPrice;
        double brushTotal = Math.floor(paintBucket * 0.48) * brushPrice;

        double totalPrice = paintPrice + wallpaperPrice + glovesTotal + brushTotal;
        double devlivery = totalPrice / 15;

        System.out.printf("This delivery will cost %.2f lv.", devlivery);


    }
}

package conditionalstatementstraining.Examproblems;

import java.util.Scanner;

public class ChangeTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sidearea = Integer.parseInt(scanner.nextLine());
        double tilesidea = Double.parseDouble(scanner.nextLine());
        double tilesideb = Double.parseDouble(scanner.nextLine());
        int bencha = Integer.parseInt(scanner.nextLine());
        int benchb = Integer.parseInt(scanner.nextLine());

        double tilestotal = (Math.pow(sidearea, 2) - (bencha * benchb)) / (tilesidea * tilesideb);
        double timespend = tilestotal * 0.2;

        System.out.printf("%f\n%f", tilestotal, timespend);
    }
}

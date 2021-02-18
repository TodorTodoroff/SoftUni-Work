package conditionalstatementstraining.Examproblems.lab;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fueltype = scanner.nextLine();
        double fuelliters = Double.parseDouble(scanner.nextLine());

        Set<String> names = new HashSet<String>();
        names.add("Diesel");
        names.add("Gasoline");
        names.add("Gas");

        if (!names.contains(fueltype)){
//        if (!(fueltype.equals("Gasoline") || fueltype.equals("Gas") || fueltype.equals("Diesel"))){
//        if (!fueltype.matches("Diesel|Gasoline|Gas")) { // works both ways

            System.out.print("Invalid fuel!");

        } else if (fuelliters >= 25) {
            System.out.printf("You have enough %s.", fueltype.toLowerCase());
        } else {
            System.out.printf("Fill your tank with %s!", fueltype.toLowerCase());
        }
    }
}

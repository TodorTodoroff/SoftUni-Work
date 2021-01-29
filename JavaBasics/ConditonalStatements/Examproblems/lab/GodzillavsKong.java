package conditionalstatementstraining.Examproblems.lab;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int actors = Integer.parseInt(scanner.nextLine());
        double clothing = Double.parseDouble(scanner.nextLine());

        double decor = 0.1*budget;
        clothing = clothing*actors;

        if ( actors > 150 ){
            clothing = 0.9 * clothing;
        }
        double actandcloth = Math.abs(budget - (decor + clothing));

        if (decor + clothing > budget){
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.",actandcloth);
        }else{
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.",actandcloth);
        }
    }
}

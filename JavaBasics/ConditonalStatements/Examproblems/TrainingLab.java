package conditionalstatementstraining.Examproblems;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//console input
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        //calculations
        b -= 1;

        double sideoneworkstations = Math.floor(a / 1.2);
        double sidetwoworkstations = Math.floor(b / 0.7);

        double workstations = sideoneworkstations * sidetwoworkstations - 3;

        System.out.println(workstations);
    }
}

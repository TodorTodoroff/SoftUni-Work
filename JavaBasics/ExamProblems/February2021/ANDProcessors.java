package February2021;

import java.util.Scanner;

public class ANDProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int processorsNeeded = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());

        double workingHours = (employees * workingDays * 8);
        double manifactured = Math.floor(workingHours / 3);
        double diff = Math.abs(processorsNeeded - manifactured) * 110.1;

        if (manifactured < processorsNeeded) {
            System.out.printf("Losses: -> %.2f BGN", diff);
        } else {
            System.out.printf("Profit: -> %.2f BGN", diff);
        }

    }
}

package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekends = Integer.parseInt(scanner.nextLine());

        double playweekends = ((double) (48 - weekends) * 0.75 + weekends) + holidays * (2.0/3);

        if ("leap".equals(year)) {
            playweekends *= 1.15;
        }
        System.out.printf("%.0f",Math.floor(playweekends));
    }
}

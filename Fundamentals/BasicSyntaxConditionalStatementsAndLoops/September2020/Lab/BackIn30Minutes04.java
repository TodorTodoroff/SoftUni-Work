package BasicSyntaxConditionalStatementsAndLoops.September2020.Lab;

import java.util.Scanner;

public class BackIn30Minutes04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 30;

        if (minutes >= 60) {
            minutes -= 60;
            hours++;
            if (hours >= 24) {
                hours -= 24;
            }
        }
        System.out.printf("%d:%02d%n", hours, minutes);

    }
}

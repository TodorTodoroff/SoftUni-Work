package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if ("f".equals(gender)) {
            if (age >= 16) {
                System.out.printf("Ms.");
            } else {
                System.out.printf("Miss");
            }

        } else {
            if (age >= 16) {
                System.out.printf("Mr.");
            } else {
                System.out.printf("Master");
            }

        }
    }

}

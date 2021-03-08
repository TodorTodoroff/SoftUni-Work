package BasicSyntaxConditionalStatementsAndLoops.September2020.Lab;

import java.util.Scanner;

public class ForeignLanguages06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        String output;
        switch (country.toLowerCase()) {
            case "usa":
            case "england":
                output = "English";
                break;
            case "spain":
            case "argentina":
            case "mexico":
                output = "Spanish";
                break;
            default:
                output = "unknown";
                break;
        }
        System.out.println(output);

    }
}

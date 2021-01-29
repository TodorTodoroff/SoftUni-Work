package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class FruitorVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String object = scanner.nextLine();

        String obj = "";

        switch (object) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                obj = "fruit";
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                obj = "vegetable";
                break;
            default:
                obj = "unknown";
        }

        System.out.println(obj);
    }
}

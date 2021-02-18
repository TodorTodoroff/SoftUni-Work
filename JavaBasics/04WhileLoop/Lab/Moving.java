package Lab;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int totalboxes = 0;

        int appSpace = width * lenght * height;

        while (!"Done".equals(input)) {
            int boxes = Integer.parseInt(input);
            totalboxes += boxes;
            if (appSpace < totalboxes) {
                break;
            }
            input = scanner.nextLine();
        }
        int diff = Math.abs(appSpace - totalboxes);
        if (appSpace < totalboxes) {
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        } else {
            System.out.printf("%d Cubic meters left.", diff);
        }
    }
}

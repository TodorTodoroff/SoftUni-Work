package ConditionalStatementsAdvanced.JavaBook;

import java.io.Console;
import java.util.Scanner;

public class PointintheFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        boolean outRect1 = ((x > 3 * h) || (x < 0)) || ((y > h) || (y < 0));
        boolean outRect2 = ((x > 2 * h) || (x < h)) || ((y > 4 * h) || (y < h));

        boolean inRect1 = ((x < 3 * h) && (x > 0)) && ((y < h) && (y > 0));
        boolean inRect2 = ((x < 2 * h) && (x > h)) && ((y < 4 * h) && (y > h));

        boolean commonborder = (x > h) && (x < 2 * h) && (y == 1);

        if (outRect1 && outRect2) {
            System.out.println("outside");
        } else if (inRect1 || inRect2 || commonborder) {
            System.out.println("inside");
        }else {
            System.out.println("border");
        }

    }
}

package July2020;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int totalPoints = 0;
        int red = 0, orange = 0, yellow = 0, white = 0, black = 0, others = 0;


        for (int i = 1; i <= n; i++) {
            String colour = scanner.nextLine();

            switch (colour) {
                case "red":
                    red ++;
                    totalPoints += 5;
                    break;
                case "orange":
                    orange ++;
                    totalPoints += 10;
                    break;
                case "yellow":
                    yellow ++ ;
                    totalPoints += 15;
                    break;
                case "white":
                    white ++;
                    totalPoints += 20;
                    break;
                case "black":
                    black++;
                    totalPoints /= 2;
                    break;
                default:
                    others++;
                    break;
            }

        }
        System.out.printf("Total points: %d%n" +
                        "Points from red balls: %d\n" +
                        "Points from orange balls: %d\n" +
                        "Points from yellow balls: %d\n" +
                        "Points from white balls: %d\n" +
                        "Other colors picked: %d\n" +
                        "Divides from black balls: %d\n",
                totalPoints, red, orange, yellow, white, others, black);

    }
}

package conditionalstatementstraining.Examproblems.lab;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalminutes = hour * 60 + (minutes + 15);
        int timeprinth = totalminutes / 60;
        int timeprintm = totalminutes % 60;

        if (timeprinth >= 24) {
            timeprinth = 00;
        }

            System.out.printf("%d:%02d", timeprinth, timeprintm);
        }

    }




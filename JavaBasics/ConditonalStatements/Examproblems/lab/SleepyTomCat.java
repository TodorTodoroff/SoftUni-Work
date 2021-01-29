package conditionalstatementstraining.Examproblems.lab;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysoff = Integer.parseInt(scanner.nextLine());

        int workday = 365 - daysoff;
        int minutesplay = workday * 63 + daysoff * 127;

        if (minutesplay > 30000) {

            System.out.printf("Tom will run away\n%d hours and %d minutes more for play",
                    Math.abs((30000 - minutesplay)) / 60,
                    Math.abs((30000 - minutesplay) % 60));
        }else{
            System.out.printf("Tom sleeps well\n%d hours and %d minutes less for play",
                    Math.abs((minutesplay - 30000) / 60),
                    Math.abs((minutesplay - 30000) % 60));

        }
    }
}

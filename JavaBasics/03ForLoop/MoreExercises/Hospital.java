package MoreExercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int treated = 0;
        int untreated = 0;
        int people = 0;
        int doctors = 7;

        // 7 patients a day
//        on every third day if treated < untreated - new doctor and 8 patients a day from there
        for (int i = 1; i <= n; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && untreated > treated) {
                doctors += 1;
            }
            people = Math.min(doctors, patients);
            treated += people;
            untreated += patients - people;

        }
        System.out.printf("Treated patients: %d.\n" +
                        "Untreated patients: %d."
                , treated, untreated);
    }
}

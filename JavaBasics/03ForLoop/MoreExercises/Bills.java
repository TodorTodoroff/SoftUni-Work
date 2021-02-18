package MoreExercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double electrbill = 0;
        double waterBill = 20 * n;
        double internetBill = 15 * n;

        for (int i = 0; i < n; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            electrbill += electricity;

        }
        double others = (electrbill + waterBill + internetBill) + (electrbill + waterBill + internetBill) * 0.2;
        double avg = (others + electrbill + waterBill + internetBill) / n;

        System.out.printf("Electricity: %.2f lv\n" +
                        "Water: %.2f lv\n" +
                        "Internet: %.2f lv\n" +
                        "Other: %.2f lv\n" +
                        "Average: %.2f lv",
                electrbill,
                waterBill,
                internetBill,
                others,
                avg);

    }
}

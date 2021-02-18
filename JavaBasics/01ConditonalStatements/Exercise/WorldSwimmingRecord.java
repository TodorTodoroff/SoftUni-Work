package conditionalstatementstraining.Examproblems.lab;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//reading from the console
        double worldrecordtime = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double timepermeter = Double.parseDouble(scanner.nextLine());
//calculations
        double speed = meters * timepermeter;

            speed = Math.floor(meters / 15) * 12.5 + speed; // m/s

        if (speed < worldrecordtime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", speed);

        } else {
            speed -= worldrecordtime;
            System.out.printf("No, he failed! He was %.2f seconds slower.", speed);
        }


    }
}

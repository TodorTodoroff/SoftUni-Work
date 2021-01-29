package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OnTimefortheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minutesArrival = Integer.parseInt(scanner.nextLine());

        int examtime = hourExam * 60 + minutesExam;
        int arrivaltime = hourArrival * 60 + minutesArrival;

        String status = "";
        String time = "";
        int difference = 0;
//early
        if (examtime - 30 > arrivaltime) {
            status = "Early";
            difference = examtime - arrivaltime;

            if (difference < 60) {
                time = String.format("%d minutes before the start", difference);
            } else {
                int hours = difference / 60;
                int minutes = difference % 60;
                time = String.format("%d:%02d hours before the start", hours, minutes);
            }
//on time
        } else if (arrivaltime <= examtime) {
            status = "On time";

            difference = examtime - arrivaltime;
            if (difference != 0) {
                time = String.format("%d minutes before the start", difference);
            }

//late
        } else {
            status = "Late";
            difference = arrivaltime - examtime;
            if (difference < 60) {
                time = String.format("%d minutes after the start", difference);
            } else {
                int hours = difference / 60;
                int minutes = difference % 60;
                time = String.format("%d:%02d hours after the start", hours, minutes);
            }
        }


        System.out.println(status);
        System.out.println(time);
    }
}

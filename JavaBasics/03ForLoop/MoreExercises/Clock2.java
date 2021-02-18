package MoreExercises;

public class Clock2 {
    public static void main(String[] args) {


        int minutes = 0;
        int seconds = 0;
        int hours = 0;
        while (hours < 24) {
            while (minutes < 60) {
                while (seconds < 60) {
                    System.out.printf("%d : %d : %d%n", hours, minutes, seconds);
                    seconds++;
                }
                minutes++;
                seconds = 0;
            }
            hours++;
            minutes = 0;

        }
    }
}

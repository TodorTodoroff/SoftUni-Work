package MoreExercises;

public class Clock {
    public static void main(String[] args) {


        int minutes = 0;
        int hours = 0;
        while (hours < 24) {
            while (minutes < 60) {
                System.out.printf("%d : %d%n", hours, minutes);
                minutes++;
            }
            hours++;
            minutes = 0;
        }

    }
}
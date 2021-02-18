package Lab;

public class Clock {
    public static void main(String[] args) {


        int minutes = 0;
        int hours = 0;
        while (hours < 24) {
            while (minutes < 60) {
                System.out.printf("%d:%d%n", hours, minutes);
                minutes++;
            }
            hours++;
            minutes = 0;
        }

//        for (int hour = 0; hour < 24; hour++) {
//            for (int minutes = 0; minutes < 60; minutes++) {
//
//                System.out.printf("%02d:%d%n", hour, minutes);
//
//            }
//
//        }

    }
}

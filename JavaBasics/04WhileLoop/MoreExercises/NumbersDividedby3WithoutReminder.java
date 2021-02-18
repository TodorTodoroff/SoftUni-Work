package MoreExercises;

public class NumbersDividedby3WithoutReminder {
    public static void main(String[] args) {

        int number = 1;
        while (number <= 100) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
            number++;
        }

    }
}

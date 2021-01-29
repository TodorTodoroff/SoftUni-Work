package conditionalstatementstraining.Examproblems;

import java.util.Scanner;

public class Numbersto100words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String num = "";


        if(number == 1){
            num = "one";
        }else if (number == 2){
            num = "two";
        }else if(number == 3 ) {
            num = "three";
        }else if (number == 4 ) {
            num = "four";
        }else if (number == 5) {
            num = "five";
        }else if ( number == 6) {
            num = "six";
        }else if ( number == 7 ) {
            num = "seven";
        } else if ( number == 8 ) {
            num = "eight";
        }else if (number == 9){
            num = "nine";
        }else if ( number == 10){
            num = "ten";
        }if(number == 11){
            num = "eleven";
        }else if (number == 12){
            num = "twelve";
        }else if(number == 13 ) {
            num = "thirteen";
        }else if (number == 14 ) {
            num = "fourteen";
        }else if (number == 15) {
            num = "fifteen";
        }else if ( number == 16) {
            num = "sixteen";
        }else if ( number == 17 ) {
            num = "seventeen";
        } else if ( number == 18 ) {
            num = "eighteen";
        }else if (number == 19){
            num = "nineteen";
        }else if ( number == 20){
            num = "twenty";
        }if (number > 20){
            number = number / 10;
            number = number % 10;
        }
        System.out.println(num);
    }
}

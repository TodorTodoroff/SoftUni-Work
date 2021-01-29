package conditionalstatementstraining.Examproblems.lab;

import java.util.Scanner;

public class seconds {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int firsttime = Integer.parseInt(scanner.nextLine());
            int secondtime = Integer.parseInt(scanner.nextLine());
            int thirdtime = Integer.parseInt(scanner.nextLine());
            int totaltime = firsttime + secondtime + thirdtime;

            int minutes = totaltime / 60;
            int seconds = totaltime % 60;


            if (seconds < 10 ){
                System.out.printf("%d:0%d",minutes, seconds);

            }else {
                System.out.printf("%d:%d",minutes, seconds);
            }
        }
    }

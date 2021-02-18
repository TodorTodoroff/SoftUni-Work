package Lab;

import java.io.PrintStream;
import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int seats = Integer.parseInt(scanner.nextLine());
        int currentMovie = 0;
        int allTickets = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        int takenSeats = seats;
        String ticket = scanner.nextLine();

        while (!movieName.equals("Finish")) {
            while (!ticket.equals("End")) {
                if (ticket.equals("Finish")){
                    break;
                }
                currentMovie++;
                allTickets++;
                if ("student".equals(ticket)) {
                    p1++;
                } else if ("standard".equals(ticket)) {
                    p2++;
                } else if ("kid".equals(ticket)) {
                    p3++;
                }
                ticket = scanner.nextLine();
            }
            double percentCurrentMovie = (currentMovie / (double) seats) * 100;
            System.out.printf("%s - %.2f%% full.%n",
                    movieName,
                    percentCurrentMovie);
            currentMovie = 0;
            if ("Finish".equals(ticket)) {
                break;
            }
            movieName = scanner.nextLine();
            seats = Integer.parseInt(scanner.nextLine());
            ticket = scanner.nextLine();

        }
        System.out.printf("Total tickets: %d%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", (p1 / allTickets) * 100);
        System.out.printf("%.2f%% standard tickets.%n", (p2 / allTickets) * 100);
        System.out.printf("%.2f%% kids tickets.", (p3 / allTickets) * 100);

    }
}

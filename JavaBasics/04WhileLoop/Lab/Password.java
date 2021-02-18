package Lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String uname = scanner.nextLine();
        String pass = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals(pass)) {
            System.out.println("Wrong Password!");
            input = scanner.nextLine();

        }
        System.out.printf("Welcome %s!", uname);

    }
}

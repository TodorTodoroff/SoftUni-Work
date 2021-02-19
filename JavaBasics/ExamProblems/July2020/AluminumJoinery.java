package July2020;

import java.util.Scanner;

public class AluminumJoinery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int windowsCount = Integer.parseInt(scanner.nextLine());
        String windowsType = scanner.nextLine();
        String delivery = scanner.nextLine();

        double pricePerUnit = 0;

        switch (windowsType) {
            case "90X130":
                pricePerUnit = 110;
                if (windowsCount > 30 && windowsCount < 60) {
                    pricePerUnit *= 0.95;
                } else if (windowsCount > 60) {
                    pricePerUnit *= 0.92;
                }
                break;
            case "100X150":
                pricePerUnit = 140;
                if (windowsCount > 40 && windowsCount < 80) {
                    pricePerUnit *= 0.94;
                } else if (windowsCount > 80) {
                    pricePerUnit *= 0.90;
                }
                break;
            case "130X180":
                pricePerUnit = 190;
                if (windowsCount > 20 && windowsCount < 50) {
                    pricePerUnit *= 0.93;
                } else if (windowsCount > 50) {
                    pricePerUnit *= 0.88;
                }
                break;
            case "200X300":
                pricePerUnit = 250;
                if (windowsCount > 25 && windowsCount < 50) {
                    pricePerUnit *= 0.91;
                } else if (windowsCount > 50) {
                    pricePerUnit *= 0.86;

                }

                break;

        }
        double totalPrice = pricePerUnit * windowsCount;

        if (windowsCount > 10) {
            if ("With delivery".equals(delivery)) {
                totalPrice += 60;
            }
            if (windowsCount > 99) {
                totalPrice *= 0.96;
            }
            System.out.printf("%.2f BGN", totalPrice);
        } else {
            System.out.print("Invalid order");
        }

    }
}

package February2021;

import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String typeSouvenir = scanner.nextLine();
        int souvenirCount = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        boolean souvenirValid = false;
        boolean countryValid = false;

        switch (country) {
            case "Argentina":
                switch (typeSouvenir) {
                    case "flags":
                        totalPrice = 3.25 * souvenirCount;
                        break;
                    case "caps":
                        totalPrice = 7.2 * souvenirCount;

                        break;
                    case "posters":
                        totalPrice = 5.1 * souvenirCount;

                        break;
                    case "stickers":
                        totalPrice = 1.25 * souvenirCount;

                        break;
                    default:
                        System.out.printf("Invalid stock!");
                        souvenirValid = true;
                }
                break;
            case "Brazil":
                switch (typeSouvenir) {
                    case "flags":
                        totalPrice = 4.2 * souvenirCount;
                        break;
                    case "caps":
                        totalPrice = 8.5 * souvenirCount;

                        break;
                    case "posters":
                        totalPrice = 5.35 * souvenirCount;

                        break;
                    case "stickers":
                        totalPrice = 1.2 * souvenirCount;

                        break;
                    default:
                        System.out.printf("Invalid stock!");
                        souvenirValid = true;

                }
                break;

            case "Croatia":
                switch (typeSouvenir) {
                    case "flags":
                        totalPrice = 2.75 * souvenirCount;
                        break;
                    case "caps":
                        totalPrice = 6.9 * souvenirCount;

                        break;
                    case "posters":
                        totalPrice = 4.95 * souvenirCount;

                        break;
                    case "stickers":
                        totalPrice = 1.1 * souvenirCount;

                        break;
                    default:
                        System.out.printf("Invalid stock!");
                        souvenirValid = true;

                }
                break;

            case "Denmark":
                switch (typeSouvenir) {
                    case "flags":
                        totalPrice = 3.1 * souvenirCount;
                        break;
                    case "caps":
                        totalPrice = 6.5 * souvenirCount;

                        break;
                    case "posters":
                        totalPrice = 4.8 * souvenirCount;

                        break;
                    case "stickers":
                        totalPrice = 0.9 * souvenirCount;

                        break;
                    default:
                        System.out.printf("Invalid stock!");
                        souvenirValid = true;

                }
                break;

            default:
                System.out.printf("Invalid country!");
                countryValid = true;
                break;

        }
        if (!countryValid && !souvenirValid) {
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, typeSouvenir, country, totalPrice);
        }
    }
}

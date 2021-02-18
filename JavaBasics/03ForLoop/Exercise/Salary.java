package Exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        boolean isLost = false;

        for (int i = 1; i <= n; i++) {
            String site = scanner.nextLine();
            switch (site) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {
                isLost = true;
                break;
            }

        }
        if (salary <= 0) {
            System.out.printf("You have lost your salary.");
        } else {
            System.out.printf("%d", salary);
        }
    }
}

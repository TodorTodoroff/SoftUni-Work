package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class Workinghours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine().toLowerCase();

        boolean openHours = hour >= 10 && hour < 18;
        boolean openDays = day.equals("monday") || day.equals("tuesday") || "wednesday".equals(day) ||
                "thursday".equals(day) || "friday".equals(day) || "saturday".equals(day);

        if (openHours && openDays) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }

//        if ((hour >= 10) && (hour < 18)) {
//            if (("monday".equals(day)) ||
//                    ("tuesday".equals(day)) ||
//                    ("wednesday".equals(day)) ||
//                    ("thursday".equals(day)) ||
//                    ("friday".equals(day)) ||
//                    ("saturday".equals(day))) {
//
//                day = "open";
//
//            }else {
//                day = "closed";
//            }
//
//        } else {
//            day = "closed";
//        }
//        System.out.println(day);
    }
}


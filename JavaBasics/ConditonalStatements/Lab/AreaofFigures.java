package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaofFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat= new DecimalFormat("#.###");

        String figure = scanner.nextLine();
        double parameter = Double.parseDouble(scanner.nextLine());


        if (figure.equals("square")) {

            System.out.println(decimalFormat.format(parameter * parameter));

        }else if (figure.equals("rectangle")){

            double parameter1 = Double.parseDouble(scanner.nextLine());
            System.out.println(decimalFormat.format(parameter*parameter1));

        }else if (figure.equals("circle")){

            System.out.println(decimalFormat.format(Math.PI*parameter*parameter));

        }else if (figure.equals("triangle")){

            double parameter1 = Double.parseDouble(scanner.nextLine());
            System.out.println(decimalFormat.format((parameter*parameter1)/2));
        }
    }
}

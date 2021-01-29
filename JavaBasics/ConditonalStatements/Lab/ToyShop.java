package com.company;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripprice = Double.parseDouble(scanner.nextLine());
        int puzzlecount = Integer.parseInt(scanner.nextLine());
        int talkingdollcount = Integer.parseInt(scanner.nextLine());
        int teddybearcount = Integer.parseInt(scanner.nextLine());
        int minionscount = Integer.parseInt(scanner.nextLine());
        int truckscount = Integer.parseInt(scanner.nextLine());

        double toysprice = puzzlecount*2.60 + talkingdollcount*3 + teddybearcount*4.1 + minionscount*8.2 + truckscount*2.0;
        double toyscount = puzzlecount+talkingdollcount+teddybearcount+minionscount+truckscount;

        if (toyscount >= 50 ){
            toysprice *= 0.75;
        }
        toysprice *= 0.9;
        if (toysprice >= tripprice){
            System.out.printf("Yes! %.2f lv left.", toysprice - tripprice);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.",Math.abs(toysprice - tripprice));
        }
    }
}

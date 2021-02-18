package Lab;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int inp = input.length();

        for (int i = 0; i < inp; i++) {
            char letter = input.charAt(i);
            System.out.println(letter);


        }
    }
}

package Ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> friends = new ArrayList<>();
        while (true) {
            System.out.println("Enter friend (e - for exit): ");
            String input = scanner.nextLine();
            if (input.equals("e")) break;
            friends.add(input);
        }
        System.out.println(friends);
        friends.sort(Comparator.naturalOrder());
        System.out.println(friends);
    }
}

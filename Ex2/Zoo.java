package Ex2;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList<>();
        zoo.add(0, "dog");
        zoo.add(1, "cat");
        zoo.add(2, "cow");
        zoo.add(3, "tiger");
        zoo.add(4, "python");
        zoo.add(5, "elephant");
        zoo.add(6, "giraffe");
        zoo.add(7, "monkey");
        zoo.add(8, "lion");

        System.out.println(zoo);
    }
}
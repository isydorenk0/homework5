package Ex4;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listInt.add(random.nextInt(50));
        }
        System.out.println(listInt);
        ListIterator<Integer> listIterator = listInt.listIterator();
        while (listIterator.hasNext()){
            listIterator.set(listIterator.next() + 1);
        }
        System.out.println(listInt);
    }
}

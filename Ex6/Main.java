package Ex6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listTeachers = new ArrayList<>();
        listTeachers.add("Teacher 1");
        listTeachers.add("Teacher 2");
        listTeachers.add("Teacher 3");
        listTeachers.add("Teacher 4");
        listTeachers.add("Teacher 5");

        System.out.println("Best teacher's index is: " + (1 + listTeachers.indexOf("Teacher 5")));
        System.out.println("Worst teacher's index is: " + (1 + listTeachers.indexOf("Teacher 1")));
    }
}

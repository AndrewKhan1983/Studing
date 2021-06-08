package lesson13_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(0, 55);
        numbers. set(0, 555);
        System.out.println(numbers);
    }
}

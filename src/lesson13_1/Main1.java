package lesson13_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(3);
        numbers.add(9);
        numbers.add(9);
        numbers.add(2);
        numbers.add(9);

        // 1 - for (для тех, где есть индексы)
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
                    }

        // 2 - for each (для всех коллекций)
        for (Integer num:numbers) {
            System.out.println(num);
        }

        // 3 - с помощью итератора (для всех коллекций)
        for(Iterator<Integer> iter = numbers.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }

    }
}

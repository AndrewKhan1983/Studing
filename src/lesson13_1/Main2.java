package lesson13_1;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main2 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("qqq");
        set.add("aaa");
        set.add("ggg");
        set.add("eee");
        set.add("eee");
        set.add("eee");

        System.out.println(set);
    }
}

package Lesson14;

import java.util.*;

public class Holodilnik {
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String product, int value) {
        if (products.containsKey(product)) {
            int valueNow = products.get(product);
            products.put(product, value + valueNow);
        } else {
            products.put(product, value);
        }
    }

    public void printAllProducts() {
        for (String product : products.keySet()) {
            System.out.println(product + " - " + products.get(product));
        }
    }

    public void getProduct(String product, int value) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта нет");
            return;
        }
        int currentValue = products.get(product);
        if (currentValue < value) {
            products.remove(product);
            System.out.println("Недостаточно продукта");
            return;

        }
        products.put(product, currentValue - value);
    }

    public void minprod() {
        for (int ves : products.values()) {
            if (ves <= 2) {
                System.out.println(products.keySet() + "Товар заканчивается");

            }

        }


    }

    public void summaves() {
        for (int ves : products.values()) {
            System.out.println(products.values().size());

        }
    }

    public void sortByKey() {
        //System.out.println("products: " + products);
        //HashMap<String,Integer> sorted = new TreeMap<>(products);
        //System.out.println("sorted" + sorted);
        //LinkedHashMap<String,Integer> sort = new LinkedHashMap(products);
        //sort.keySet();
        List mapKeys = new ArrayList(products.keySet());
        Collections.sort(mapKeys);

    }
}



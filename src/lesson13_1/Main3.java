package lesson13_1;

import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(2.5, 2, "Золото",5);
        Coin coin2 = new Coin(2.5, 2, "Золото",5);
        Coin coin3 = new Coin(2, 10, "Серебро",10);
        Coin coin4 = new Coin(5, 5, "Бронза",25);
        Coin coin5 = new Coin(5, 2, "Серебро",25);
        Coin coin6 = new Coin(4, 2, "Золото",5);

        HashSet<Coin> coins = new HashSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        for (Coin c:coins) {
            System.out.println(c);

        }
    }
}

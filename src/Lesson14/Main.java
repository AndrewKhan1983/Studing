package Lesson14;

public class Main {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.addProduct("яблоко", 5);
        holodilnik.addProduct("груша", 3);
        holodilnik.addProduct("слива", 2);
        holodilnik.addProduct("яблоко", 7);


        holodilnik.printAllProducts();
        holodilnik.getProduct("яблоко", 30);
        holodilnik.printAllProducts();
    }
}

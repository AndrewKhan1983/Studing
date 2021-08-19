package lesson16_1;

public class Main {
    public static void main(String[] args) {
        Sklad sklad = new Sklad();

        Tovar tovar1 = new Tovar(12323,"macbook",12000);
        Tovar tovar2 = new Tovar(123,"asus",120);
        Tovar tovar3 = new Tovar(1223,"acer",1000);
        Tovar tovar4 = new Tovar(2323,"huawei",20020);
        Tovar tovar5 = new Tovar(1232,"ffff",1200000);

        sklad.addTovar(tovar1,10);
        sklad.addTovar(tovar1,15);
        sklad.addTovar(tovar2,2255);
        sklad.addTovar(tovar3,34);
        sklad.addTovar(tovar4,66);
        sklad.addTovar(tovar5,6);

        sklad.deleteTovar(tovar1,5);
        System.out.println();
    }
}

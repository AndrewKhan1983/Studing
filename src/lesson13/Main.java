package lesson13;

public class Main {
    public static void main(String[] args) {
        Tovar chainik1 = new Tovar();
        Tovar chainik2 = new Tovar();

        chainik1.setId(456);
        chainik2.setId(56896);

        chainik1.setName("Redmond");
        chainik2.setName("Tefal");

       int idChaunik = chainik1.getId();
        System.out.println(idChaunik);

        Pen pen = new Pen();
        pen.setName("Шариковая ручка");


    }
}

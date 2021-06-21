package lesson15;

public class Main2 {
    public static void main(String[] args) {
        StrinUtilsImpl delitel = new StrinUtilsImpl();
        try {
            delitel.setNumber1("4");
            delitel.setNumber2("0");
        } catch (NullPointerException e) {
            e.printStackTrace();
       }
        System.out.println("программа работает");
        try {
            delitel.setNumber1("hdfgdf");
            delitel.setNumber2("asdfdg");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("прога");
        try {
            delitel.setNumber1("6");
            delitel.setNumber2("ноль");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("на ноль делить нельзя");

        StrinUtilsImpl calculator = new StrinUtilsImpl();
        double resultDiv = calculator.div(delitel.getNumber1(), delitel.getNumber2());
        System.out.println(resultDiv);
    }
}

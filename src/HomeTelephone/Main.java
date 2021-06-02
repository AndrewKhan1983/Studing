package HomeTelephone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Telephone telephone1 = new Telephone(5.6, "Kirin", 4, "P20", "Huawei");
        Telephone telephone2 = new Telephone(6, "Snapdragon", 8, "POCO", "Xiaomi");
        Telephone telephone3 = new Telephone(5, "Snapdragon", 16, "Galaxy S21", "Samsung");
        Telephone telephone4 = new Telephone(3.5, "M1", 8, "Iphone 13 PRO", "Apple");
        Telephone telephone5 = new Telephone(4, "Atom", 2, "Ural","Irbis");
        Telephone telephone6 = new Telephone(6, "Kirin", 12, "P40", "Huawei");
        Telephone telephone7 = new Telephone(7, "Snapdragon", 8, "Pixel", "Google");
        Telephone telephone8 = new Telephone(3, "Atom", 6, "3310", "Nokia");
        Telephone telephone9 = new Telephone(6, "Exinos", 8, "Galaxy A12", "Samsung");
        Telephone telephone10 = new Telephone(5, "A14 bionic", 6, "Iphone SE", "Apple");
        Telephone telephone11 = new Telephone(5.6, "Kirin", 4, "P20", "Huawei");

        ArrayList<Telephone> phones = new ArrayList<>();
        phones.add(telephone1);
        phones.add(telephone2);
        phones.add(telephone3);
        phones.add(telephone4);
        phones.add(telephone5);
        phones.add(telephone6);
        phones.add(telephone7);
        phones.add(telephone8);
        phones.add(telephone9);
        phones.add(telephone10);
        phones.add(telephone11);

        //PhoneUtils.printAllPhonesByProduction(phones, "Google");
        //PhoneUtils.printTheBigestResolution(phones);
        PhoneUtils.printTheSmallerResolution(phones);

        //System.out.println(telephone1.equals(telephone11));


    }

}
// 1 вывести самую маленькую диагональ
// 2 вывести среднюю диагональ телефонов
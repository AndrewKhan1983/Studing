package HomeTelephone;


import java.util.ArrayList;
import java.util.Arrays;

public class PhoneUtils {
    public static void printAllPhonesByProduction(ArrayList<Telephone> phones, String production) {
        for (Telephone telephone : phones) {
            if (telephone.getProduction().equals(production)) {
                System.out.println(telephone.toString());
            }
        }
    }

        public static void printTheBigestResolution(ArrayList<Telephone> phones){
            Telephone biggestPhone = phones.get(0);
            for (Telephone telephone:phones) {
                if(telephone.getDiag()> biggestPhone.getDiag()){
                    biggestPhone = telephone;
                    System.out.println(biggestPhone);
                }

            }


    }

    public static void printTheSmallerResolution(ArrayList<Telephone> phones){
            Telephone smallerPhone = phones.get(0);
        for (Telephone telephone:phones) {
            if (telephone.getDiag()< smallerPhone.getDiag()){
                smallerPhone = telephone;
                System.out.println(smallerPhone);
            }











        }

    }
}


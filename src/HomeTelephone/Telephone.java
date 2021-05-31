package HomeTelephone;

import java.util.ArrayList;

public class Telephone {

    private ArrayList<Telephone> phones = new ArrayList<>();

    private int diag;
    private String proccesor;
    private int core;
    private String model;
    private String production;

    public Telephone() {

    }

    public Telephone(int diag, String proccesor, int core, String model, String production) {
        this.diag = diag;
        this.proccesor = proccesor;
        this.core = core;
        this.model = model;
        this.production = production;
    }


    public void printAllPhonesByProduction(Telephone phone) {
        phones.addAll(phones);



    }
}
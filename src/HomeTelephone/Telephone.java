package HomeTelephone;

import java.util.ArrayList;
import java.util.Objects;

public class Telephone {


    private double diag;
    private String proccesor;
    private int core;
    private String model;
    private String production;

    public Telephone() {

    }

    public Telephone(double diag, String proccesor, int core, String model, String production) {
        this.diag = diag;
        this.proccesor = proccesor;
        this.core = core;
        this.model = model;
        this.production = production;
    }

    public double getDiag() {
        return diag;
    }

    public void setDiag(double diag) {
        this.diag = diag;
    }

    public String getProccesor() {
        return proccesor;
    }

    public void setProccesor(String proccesor) {
        this.proccesor = proccesor;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }


    @Override
    public String toString() {
        return production + " "+model+" "+core+" "+diag+" "+proccesor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Telephone)) return false;
        Telephone telephone = (Telephone) o;
        return Double.compare(telephone.getDiag(), getDiag()) == 0 && getCore() == telephone.getCore() && Objects.equals(getProccesor(), telephone.getProccesor()) && Objects.equals(getModel(), telephone.getModel()) && Objects.equals(getProduction(), telephone.getProduction());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDiag(), getProccesor(), getCore(), getModel(), getProduction());
    }
}

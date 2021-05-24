package lesson13;

public class Tovar {
    // 1 - объявлеям переменные (характеристики данного типа)
    private String name;
    private int id;
    private int fullPrice;
    private int salePrice;

    public void setId(int id){
       this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return this.id;
    }
}

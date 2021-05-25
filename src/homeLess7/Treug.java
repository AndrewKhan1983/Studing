package homeLess7;

public class Treug {
    private String colours;
    private String name;
    public Treug(){

    }

    public void printPerimetrTreug(int a, int b, int c) {
        System.out.println("периметр "+ name + " равен " +  (a+b+c)+ ",цвет: " + colours);
    }
    public Treug (String colours, String name){
        this.colours = colours;
        this.name = name;

    }
}

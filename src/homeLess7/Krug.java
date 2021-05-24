package homeLess7;

public class Krug {
    private String colour;
    private String name;
    public Krug(){

    }

    public void perimetrKrug(int r){
        System.out.println(2*Math.PI*r);
    }
    public Krug (String colour, String name){
        this.colour = colour;
        this.name = name;
    }
}

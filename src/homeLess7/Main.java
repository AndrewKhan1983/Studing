package homeLess7;

public class Main {
    public static void main(String[] args) {

        Kvadrat kvadrat = new Kvadrat("green","Kvadrat");
        kvadrat.printPerimetrPriamoug(3,5,6,8);

        Treug treug = new Treug("Yellow","Treugolnik");
        treug.printPerimetrTreug(6,6,3);

        Priamoug priamoug = new Priamoug("Red","Priamougolnik");
        priamoug.printPerimetrPriamoug(2,3,2,3);

        Krug krug = new Krug("Blue","Krug");
        krug.perimetrKrug(3);

        }

    }



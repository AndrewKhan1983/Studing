package Home_02_06;

public class Main {
    public static void main(String[] args) {
    Drobi drob1 = new Drobi(1,5);
    Drobi drob2 = new Drobi(3,5);


    FractionNumberOperationImpl calculator = new FractionNumberOperationImpl();
    FractionNumber resultAdd = calculator.add(drob1,drob2);
        System.out.println(resultAdd);
    }
}

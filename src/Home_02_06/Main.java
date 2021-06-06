package Home_02_06;

public class Main {
    public static void main(String[] args) {
        Drobi drob1 = new Drobi(1, 6);
        Drobi drob2 = new Drobi(5, 7);


        FractionNumberOperationImpl calculator = new FractionNumberOperationImpl();
        FractionNumber resultAdd = calculator.add(drob1, drob2);
        FractionNumber resultSub = calculator.sub(drob1, drob2);
        FractionNumber resultMul = calculator.mul(drob1, drob2);
        FractionNumber resultDiv = calculator.div(drob1, drob2);

        System.out.println(resultDiv);

        //System.out.println(resultMul);

        //System.out.println(resultSub);

        //System.out.println(resultAdd);
    }
}

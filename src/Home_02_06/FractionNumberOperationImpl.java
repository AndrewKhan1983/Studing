package Home_02_06;

public class FractionNumberOperationImpl implements FractionNumberOperation {



    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        int resultDividend = a.getDividend() * b.getDivisor() +
                a.getDivisor() * b.getDividend();
        int resultDivisor = a.getDivisor() * b.getDivisor();
        Drobi result = new Drobi(resultDividend, resultDivisor);
        result.sokrashenie();
        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        return null;
    }
}

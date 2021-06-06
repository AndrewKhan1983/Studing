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
        int resultDividend = a.getDividend() * b.getDividend();
        int resultDivisor = a.getDivisor() * b.getDivisor();
        Drobi resultUmnoj = new Drobi(resultDividend, resultDivisor);
        resultUmnoj.sokrashenie();
        return resultUmnoj;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        int resultDividend = a.getDividend() * b.getDivisor();
        int resultDivisor = a.getDivisor() * b.getDividend();
        Drobi resultDelenie = new Drobi(resultDividend, resultDivisor);
        resultDelenie.sokrashenie();
        return resultDelenie;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        int resultDividendA = b.getDivisor() * a.getDividend();
        int resultDividendB = a.getDivisor() * b.getDividend();
        int resultDividend = resultDividendA - resultDividendB;
        int resultDivisorA = b.getDivisor() * a.getDivisor();
        int resultDivisorB = a.getDivisor() * b.getDivisor();
        int resultDivisor = resultDivisorA - resultDivisorB;
        Drobi resultVichitanie = new Drobi(resultDividend, resultDivisor);
        resultVichitanie.sokrashenie();
        return resultVichitanie;
    }
}

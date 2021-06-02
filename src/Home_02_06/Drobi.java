package Home_02_06;

public class Drobi implements FractionNumber{
    private double dividend;
    private double divisor;

    public Drobi() {
    }

    public Drobi(double dividend, double divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

    public void setDivisor(double divisor) {
        this.divisor = divisor;
    }

    @Override
    public void setDividend(int dividend) {

    }

    @Override
    public int getDividend() {
        return 0;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {

    }

    @Override
    public int getDivisor() {
        return 0;
    }

    @Override
    public double value() {
        return dividend / divisor;
    }
}

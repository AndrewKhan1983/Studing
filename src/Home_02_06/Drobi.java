package Home_02_06;

import java.util.Objects;

public class Drobi implements FractionNumber{
    private int divident;
    private int divisor;

    public Drobi() {
    }

    public Drobi(int divident, int divisor) {
        this.divident = divident;
        this.divisor = divisor;


    }

    @Override
    public void setDividend(int dividend) {
        this.divident = dividend;
    }

    @Override
    public int getDividend() {
        return divident;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
    this.divisor = divisor;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public double value() {
        return divident / (double)divisor;
    }
    public void sokrashenie(){
        // 5/15, 2/16, 3/9, 4/10

        for (int i = Math.min(divident,divisor); i >= 2; i--){
            if (divident %i ==0 && divisor %i ==0){
                divident = divident / i;
                divisor = divisor / i;

            }

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drobi)) return false;
        Drobi drobi = (Drobi) o;
        return divident == drobi.divident && getDivisor() == drobi.getDivisor();
    }

    @Override
    public int hashCode() {
        return Objects.hash(divident, getDivisor());
    }

    @Override
    public String toString() {
        return divident + "/" + divisor;
    }
}

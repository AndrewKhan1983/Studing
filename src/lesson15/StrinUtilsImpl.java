package lesson15;

import java.util.Objects;

public class StrinUtilsImpl implements StringUtils {
    private String number1;
    private String number2;

    public StrinUtilsImpl() {
    }

    public StrinUtilsImpl(String number1, String number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StrinUtilsImpl)) return false;
        StrinUtilsImpl that = (StrinUtilsImpl) o;
        return Objects.equals(getNumber1(), that.getNumber1()) && Objects.equals(getNumber2(), that.getNumber2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber1(), getNumber2());
    }

    @Override
    public String toString() {
        return "StrinUtilsImpl{" +
                "number1='" + number1 + '\'' +
                ", number2='" + number2 + '\'' +
                '}';
    }

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        String delimoe = new String(number1);
        String delitel = new String(number2);
        int num1 = Integer.parseInt(delimoe);
        int num2 = Integer.parseInt(delitel);
        int div = num1 / num2;
        if ((num1 & num2) == Integer.parseInt(null)){
            throw new NullPointerException("(num1 & num2) == Integer.parseInt(null)");


            }
        if (num2==0){
            throw new ArithmeticException("num2==0");

        }







        return div;
    }

    // Pattern
    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}

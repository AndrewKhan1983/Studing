package lesson15;

public class StringUtilsImpl implements StringUtils{
    public StringUtilsImpl() {
    }

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (" ".equals(number1) && " ".equals(number2)) {
            throw new NumberFormatException("number1 или number2 null");
        }
        double Number1 = Double.parseDouble(number1);
        double Number2 = Double.parseDouble(number2);

        double result = Number1 / Number2;

        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 или number2 не число");
        }
        if (Number1 == 0 || Number2 == 0) {
            throw new ArithmeticException("number2 = 0");
        }


        return result;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}

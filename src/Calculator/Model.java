package Calculator;

public class Model {
    public long calculate(String operator, int number1, int number2) {
        if (operator.equals("+")) {
            return number1 + number2;
        } else if (operator.equals("-")) {
            return number1 - number2;
        } else if (operator.equals("*")) {
            return number1 * number2;
        } else {
            return number1 / number2;

        }
    }
}

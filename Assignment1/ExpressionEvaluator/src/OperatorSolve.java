public class OperatorSolve {

    public static int compute(int value1, int value2, char operator) {

        return switch (operator) {
            case '+' -> value1 + value2;
            case '-' -> value1 - value2;
            case '*' -> value1 * value2;
            case '^' -> (int)Math.pow(value1, value2);
            default -> -1;
        };

    } // close compute

} // close class
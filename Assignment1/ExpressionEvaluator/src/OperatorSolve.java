/*************************************************
 File: OperatorSolve.java
 By: Geoart Corral
 Date: 02.19.24

 Compile: javac OperatorSolve.java
 Usage: Run through an IDE (Used Intellij)
 System: All

 Description: This program takes in 4 integers from the user
    and evaluates predefined postfix and infix expressions
    using the inputted values. The results are displayed.
 *************************************************/

public class OperatorSolve {

    /********************************************
    int compute(int value1, int value2, char operator)
    computes and returns the values with the respective operator
    ********************************************/
    public static int compute(int value1, int value2, char operator) {
        // Return answer based on values and given operator
        return switch (operator) {
            case '+' -> value1 + value2;
            case '-' -> value1 - value2;
            case '*' -> value1 * value2;
            case '^' -> (int)Math.pow(value1, value2);
            default -> -1;
        };

    } // close compute

} // close class
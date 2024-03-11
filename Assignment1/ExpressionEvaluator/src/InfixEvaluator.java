/*************************************************
 File: InfixEvaluator.java
 By: Geoart Corral
 Date: 02.19.24

 Compile: javac InfixEvaluator.java
 Usage: Run through an IDE (Used Intellij)
 System: All

 Description: This program takes in 4 integers from the user
    and evaluates predefined postfix and infix expressions
    using the inputted values. The results are displayed.
 *************************************************/

import java.util.Stack;

public class InfixEvaluator {

    /********************************************
    public static void evaluateInfix(String str) {
    solves and prints (a+b)*(c+d) with user given values
    ********************************************/
    public static void evaluateInfix(String str) {
        Stack<Character> operatorStack = new Stack<>();
        Stack<Integer> valueStack = new Stack<>();

        // To use as parameters for operatorSolve and hold result
        int value1;
        int value2;
        char operator;
        int result;

        // Bring in the stored integers
        int a = ExpressionDriver.a;
        int b = ExpressionDriver.b;
        int c = ExpressionDriver.c;
        int d = ExpressionDriver.d;


        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            switch (current) {
                // Push ( and a-d
                case '(':
                    operatorStack.push(current);
                    break;
                case 'a':
                    valueStack.push(a);
                    break;
                case 'b':
                    valueStack.push(b);
                    break;
                case 'c':
                    valueStack.push(c);
                    break;
                case 'd':
                    valueStack.push(d);
                    break;
                case ')':
                    // Bring out values and operators to solve
                    value1 = valueStack.pop();
                    value2 = valueStack.pop();
                    operator = operatorStack.pop();

                    // Solve
                    valueStack.push(OperatorSolve.compute(value1, value2, operator));

                    // Remove the matching parenthesis
                    operatorStack.pop();
                    break;
                // Remaining characters are '+' and '*'
                default:
                    operatorStack.push(current);
                    break;
            } // close switch statement
        } // close for loop

        // Solve remaining and store
        value1 = valueStack.pop();
        value2 = valueStack.pop();
        operator = operatorStack.pop();
        result = OperatorSolve.compute(value1, value2, operator);

        System.out.println("Value of infix string (a+b)*(c+d) with " +
                "a = " + a + ", b = " + b + ", c = " + c + ", d = " + d +
                " is " + result);

    } // close evaluateInfix
} // close class

/*************************************************
 File: PostFixEvaluator.java
 By: Geoart Corral
 Date: 02.19.24

 Compile: javac PostFixEvaluator.java
 Usage: Run through an IDE (Used Intellij)
 System: All

 Description: This program takes in 4 integers from the user
    and evaluates predefined postfix and infix expressions
    using the inputted values. The results are displayed.
 *************************************************/

import java.util.Stack;

public class PostFixEvaluator {

    /********************************************
    public static void evaluateInfix(String str) {
    solves and prints ac-b^d+ with user given values
    ********************************************/
    public static void evaluatePostfix(String str) {
        Stack<Integer> valueStack = new Stack<>();

        // To use as parameters for operatorSolve and hold result
        int value1;
        int value2;
        int result;

        // Bring in the stored integers
        int a = ExpressionDriver.a;
        int b = ExpressionDriver.b;
        int c = ExpressionDriver.c;
        int d = ExpressionDriver.d;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            switch (current) {
                // Push a-d
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
                case '+': case '-': case '^':
                    // Bring out values to solve
                    value2 = valueStack.pop();
                    value1 = valueStack.pop();

                    // Solve with current operator
                    valueStack.push(OperatorSolve.compute(value2, value1, current));

                    break;
            } // close switch statement
        } // close for loop

        result = valueStack.pop();

        System.out.println("Value of postfix string ac−b^d+ with " +
                "a = " + a + ", b = " + b + ", c = " + c + ", d = " + d +
                " is " + result + "\n");

    } // close evaluatePostfix
} // close class

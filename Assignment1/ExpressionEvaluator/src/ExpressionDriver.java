/*************************************************
 File: ExpressionDriver.java
 By: Geoart Corral
 Date: 02.19.24

 Compile: javac ExpressionDriver.java
 Usage: Run through an IDE
 System: All

 Description: This program takes in 4 integers from the user
    and evaluates predefined postfix and infix expressions
    using the inputted values. The results are displayed.
 *************************************************/

import java.util.Scanner;

public class ExpressionDriver {
    // Predefined expressions to solve from
    private static final String infixExpression = "(a+b)*(c+d)";
    private static final String postfixExpression = "ac-b^d+";

    // Variables to store user inputted values in program
    public static int a;
    public static int b;
    public static int c;
    public static int d;

    public static void main(String[] args) {
        // Create scanner object: input
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Is computing needed? (yes/no): ");
            String inputStr = input.nextLine();

            // Stop upon typing "no"
            if (inputStr.equals("no")) {
                System.out.println("Thank you. Goodbye!");
                System.exit(0);
            // Any invalid response repeats the question
            } else if (!inputStr.equals("yes")) {
                System.out.println("INVALID RESPONSE - TRY AGAIN \n");
                continue;
            }

            // Get the values for the identifiers
            System.out.print("Please enter 4 integers, separated by space, for the identifiers" +
                    " a, b, c, and d: ");
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            d = input.nextInt();

            // Prevent an automatic line read on repeat
            input.nextLine();

            // Compute the expressions
            InfixEvaluator.evaluateInfix(infixExpression);
            PostFixEvaluator.evaluatePostfix(postfixExpression);

        } // close while loop
    } // close main
}
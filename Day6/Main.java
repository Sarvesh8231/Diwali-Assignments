package Day6;

import Day6.Calculator;
import Day6.WrongOperatorException;

public class Main {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 5;

            System.out.println("Addition: " + Calculator.calculate(num1, num2, "+"));
            System.out.println("Subtraction: " + Calculator.calculate(num1, num2, "-"));
            System.out.println("Multiplication: " + Calculator.calculate(num1, num2, "*"));
            System.out.println("Division: " + Calculator.calculate(num1, num2, "/"));
            System.out.println("Modulus: " + Calculator.calculate(num1, num2, "%"));

            // Test with invalid operator
            System.out.println("Invalid Operator: " + Calculator.calculate(num1, num2, "#"));

        } catch (WrongOperatorException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());
        }
    }
}

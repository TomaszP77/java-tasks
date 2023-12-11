package task12;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;

        System.out.println("enter the first number");
        firstNumber = getInt();
        System.out.println("enter the second number");
        secondNumber = getInt();

        BasicMathematicalOperations calculator = new BasicMathematicalOperations();

        int addition = calculator.addition(firstNumber, secondNumber);
        int subtraction = calculator.subtraction(firstNumber, secondNumber);
        int multiplication = calculator.multiplication(firstNumber, secondNumber);
        int division = calculator.division(firstNumber, secondNumber);
        int modulo = calculator.modulo(firstNumber, secondNumber);

        System.out.println("Addition - " + addition);
        System.out.println("Subtraction - " + subtraction);
        System.out.println("Multiplication - " + multiplication);
        System.out.println("Division - " + division);
        System.out.println("Modulo - " + modulo);
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;

        System.out.println("enter the first number");
        firstNumber = getInt();
        System.out.println("enter the second number");
        secondNumber = getInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int modulo = firstNumber % secondNumber;

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

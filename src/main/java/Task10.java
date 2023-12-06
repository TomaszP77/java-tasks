import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        int number;
        int luckyNumber = (int) (Math.random() * 10);

        System.out.println("Enter your number");
        number = getInt();

        if (number < 0 || number > 10) {
            System.out.println("The number provided is incorrect. Please enter a number from 1 to 10.");
        } else if (number == luckyNumber) {
            System.out.println("Congratulations, your number wins the grand prize of $1,000");
        } else {
            System.out.println("I'm sorry your number is not a lucky number.The lucky number is: " + luckyNumber);
        }
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}

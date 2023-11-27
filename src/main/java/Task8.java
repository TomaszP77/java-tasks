import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        System.out.println("Enter a number");

        int number = getInt();

        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5");
        } else {
            System.out.println(number + " is not divisible by 5");
        }
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}


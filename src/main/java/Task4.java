import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("Enter the year");
        int year = getInt();

        if (year < 1 || year > 9999) {
            System.out.println("Enter a valid year from 1 to 9999");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It's not a leap year");
        }
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}

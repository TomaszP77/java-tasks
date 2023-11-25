public class Task6 {

    public static void main(String[] args) {
        int numberOfDays = numberOfDaysInFebruary(2003);
        System.out.println(" The number of days in February is " + numberOfDays);
    }

    public static int numberOfDaysInFebruary(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return 29;
        } else {
            return 28;
        }
    }
}

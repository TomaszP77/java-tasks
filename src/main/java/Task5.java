public class Task5 {

    public static void main(String[] args) {
        int numberOfDays = numberOfDays(2, 2000);
        System.out.println(" The number of days in the given month is " + numberOfDays);
    }

    public static int numberOfDays(int monthNumber, int year) {

        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 11:
            case 9:
                return 30;
            default:
                return -1;
        }
    }
}

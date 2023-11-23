public class Task5 {

    public static void main(String[] args) {
        int liczbaDni = iloscDni(2, 2000);
        System.out.println(" Liczba dni w podanym miesiacu to " + liczbaDni);
    }

    public static int iloscDni(int numerMiesiaca, int rok) {

        switch (numerMiesiaca) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (rok % 4 == 0 && rok % 100 != 0 || rok % 400 == 0) {
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

public class Task7 {

    public static void main(String[] args) {
        Task7 solution = new Task7();
        solution.loopDoWhile();
        solution.loopWhile();
        solution.loopFor();
    }

    public void loopWhile() {

        int a = 1;

        System.out.println("Loop 'While' ");
        while (a <= 10) {
            if (a % 2 == 0) {
                System.out.println(a + " even number");
            } else {
                System.out.println(a + " odd number");
            }
            a++;
        }
    }

    public void loopDoWhile() {

        int a = 1;

        System.out.println(" Loop 'Do While' ");
        do {
            if (a % 2 == 0) {
                System.out.println(a + " even number");
            } else {
                System.out.println(a + " odd number");
            }
            a++;
        } while (a <= 10);
    }

    public void loopFor() {

        int a = 10;

        System.out.println("Loop 'For' ");
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " even number");
            } else {
                System.out.println(i + " odd number");
            }
        }
    }
}

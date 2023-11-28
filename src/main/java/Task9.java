import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        String word1;
        String word2;

        System.out.println("Enter the first word");
        word1 = getWord();

        System.out.println("Enter the second word");
        word2 = getWord();

        System.out.println(word2 + " " + word1);
    }

    public static String getWord() {
        return new Scanner(System.in).next();
    }
}

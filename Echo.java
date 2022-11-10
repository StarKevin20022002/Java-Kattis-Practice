import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        input.close();

        int i = 0;

        while (i < 3) {
            System.out.print(word + " ");
            ++i;
        }
    }
}

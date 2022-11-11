

import java.util.Scanner;

public class DigitSwap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        /** "swap" digits */
        String num_swap = Integer.toString(num);
        System.out.print(num_swap.charAt(1));
        System.out.print(num_swap.charAt(0));

        input.close();
    }
}

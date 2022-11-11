/**
* Problem: Digit Swap
* Link: https://open.kattis.com/problems/digitswap
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

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

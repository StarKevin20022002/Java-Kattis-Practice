/**
* Problem: Shattered Cake
* Link: https://open.kattis.com/problems/shatteredcake
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 3.63
*/

import java.util.Scanner;

public class ShatteredCake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total_width = input.nextInt();
        int pieces = input.nextInt();
        int i;
        int piece_width = 0;
        int piece_length = 0;
        int total_area = 0;
        int total_length = 0;

        /** calculate total area of the cake */
        for(i = 0; i < pieces; i++) {
            piece_width = input.nextInt();
            piece_length = input.nextInt();
            total_area += piece_width * piece_length;
            piece_width = 0;
            piece_length = 0;
        }

        /** find and print the initial cake length */
        total_length = total_area / total_width;
        System.out.println(total_length);

        input.close();
    }
}

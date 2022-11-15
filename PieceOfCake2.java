/**
* Problem: Piece of Cake!
* Link: https://open.kattis.com/problems/pieceofcake2
* @author TRONG NHAN MAI
* @version 1.0, 11/15/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class PieceOfCake2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /** input values */
        int cake_size = input.nextInt();
        int x_cut = input.nextInt();
        int x_remain = cake_size - x_cut;
        int y_cut = input.nextInt();
        int y_remain = cake_size - y_cut;

        /** pick the larger size */
        int x = (x_cut > x_remain) ? x_cut : x_remain;
        int y = (y_cut > y_remain) ? y_cut : y_remain;

        /** calculate cake volume */
        int cake_vol = x * y * 4;
        System.out.println(cake_vol);

        input.close();
    }
}

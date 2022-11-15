/**
* Problem: Square Peg
* Link: https://open.kattis.com/problems/squarepeg
* @author TRONG NHAN MAI
* @version 1.0, 11/15/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class SquarePeg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int square_side = input.nextInt();
        int circle_radius = input.nextInt();

        if((double)(Math.sqrt(2 * Math.pow((double)square_side, 2)) - 2 * circle_radius) < 0.0) {
            System.out.println("fits");
        } else {
            System.out.println("nope");
        }

        input.close();
    }
}

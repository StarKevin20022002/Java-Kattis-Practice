/**
* Problem: Grass Seed Inc.
* Link: https://open.kattis.com/problems/grassseed
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.16
*/

import java.util.Scanner;

public class GrassSeed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double seed_price = input.nextDouble();
        int lawn = input.nextInt();
        double width = 0.0;
        double length = 0.0;
        double total_price = 0.0;
        int i;

        /** calculate total price */
        for(i = 0; i < lawn; i++) {
            width = input.nextDouble();
            length = input.nextDouble();
            total_price += width * length * seed_price;
            width = 0.0;
            length = 0.0;
        }

        /** print result */
        System.out.println(total_price);

        input.close();
    }
}

/**
* Problem: Nasty Hacks
* Link: https://open.kattis.com/problems/nastyhacks
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.12
*/

import java.util.Scanner;

public class NastyHack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        int no_ad = 0;
        int with_ad = 0;
        int cost = 0;
        int i;

        /** consider profit */
        for(i = 0; i < cases; i++) {
            no_ad = input.nextInt();
            with_ad = input.nextInt();
            cost = input.nextInt();
            if((with_ad - no_ad) > cost) {
                System.out.println("advertise");
            } else if((with_ad - no_ad) == cost) {
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }
        }

        input.close();
    }
}

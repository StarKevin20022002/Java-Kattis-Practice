/**
* Problem: Oddities
* Link: https://open.kattis.com/problems/oddities
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.12
*/

import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int list = input.nextInt();
        int x = 0;
        int i;

        /** check for oddities and print results */
        for(i = 0; i < list; i++) {
            x = input.nextInt();
            if(x % 2 != 0) {
                System.out.println(x + " is odd");
            } else {
                System.out.println(x + " is even");
            }
            x = 0;
        }

        input.close();
    }
}
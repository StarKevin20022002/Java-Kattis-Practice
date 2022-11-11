/**
* Problem: Tarifa
* Link: https://open.kattis.com/problems/tarifa
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int megabyte = input.nextInt();
        int month = input.nextInt();
        int available = 0;
        int i;

        /** calculate availabe storage after given month*/
        for(i = 0; i < month; i++) {
            available += megabyte - input.nextInt();
        }

        /** add storage for 1 extra month */
        available += megabyte;

        /** print out result */
        System.out.println(available);

        input.close();
    }
}

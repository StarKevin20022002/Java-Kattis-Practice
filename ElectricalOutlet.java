/**
* Problem: Electrical Outlets
* Link: https://open.kattis.com/problems/electricaloutlets
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.11
*/

import java.util.Scanner;

public class ElectricalOutlet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        int strip;
        int outlet = 0;
        int i, j;

        /** calculate total outlet */
        for(i = 0; i < cases; i++) {
            strip = input.nextInt();
            for(j = 0; j < strip; j++) {
                outlet += input.nextInt();
            }
            outlet -= strip - 1;
            System.out.println(outlet);
            strip = 0;
            outlet = 0;
        }

        input.close();
    }   
}

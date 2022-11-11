/**
* Problem: Odd Echo
* Link: https://open.kattis.com/problems/oddecho
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class OddEcho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int voices = input.nextInt();
        String speech = "";
        int i;

        /** echo */
        for(i = 0; i < voices; i++) {
            speech = input.next();
            if(i % 2 == 0) {
                System.out.println(speech);
            }
            speech = "";
        }

        input.close();
    }
}

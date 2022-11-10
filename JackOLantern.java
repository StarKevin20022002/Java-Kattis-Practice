/**
* Problem: Jack-O'-Lantern Juxtaposition
* Link: https://open.kattis.com/problems/jackolanternjuxtaposition
* @author TRONG NHAN MAI
* @version 1.0, 11/10/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class JackOLantern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int comb = 1;

        /** calculate total combinations */
        for(int i = 0; i < 3; i++) {
            comb *= input.nextInt();
        }

        /** print the result */
        System.out.println(comb);
        
        input.close();
    }
}

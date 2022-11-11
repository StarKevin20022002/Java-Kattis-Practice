/**
* Problem: Autori
* Link: https://open.kattis.com/problems/autori
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.09
*/

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String check = input.next();
        int i;

        for(i = 0; i < check.length(); i++) {
            if((int)check.charAt(i) >= 65 && (int)check.charAt(i) <= 90) {
                System.out.print(check.charAt(i));
            }
        }

        input.close();
    }
}

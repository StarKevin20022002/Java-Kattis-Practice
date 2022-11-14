/**
* Problem: Double Password
* Link: https://open.kattis.com/problems/doublepassword
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.09
*/

import java.util.Scanner;

public class DoublePassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password1 = input.next();
        String password2 = input.next();
        int combination = 1;

        for(int i = 0; i < password1.length(); i++) {
            if(password1.charAt(i) == password2.charAt(i)) {
                combination *= 1;
            } else {
                combination *= 2;
            }
        }

        System.out.println(combination);
        input.close();
    }
}

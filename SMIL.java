/**
* Problem: SMIL
* Link: https://open.kattis.com/problems/smil
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class SMIL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String test = input.next();

        for(int i = 0; i < test.length(); i++) {
            if(test.charAt(i) == ':' || test.charAt(i) == ';') {
                if((i+1) == test.length()) {
                    break;
                } else if(test.charAt(i+1) == ')') {
                    System.out.println(i);
                } else if(test.charAt(i+1) == '-' && test.charAt(i+2) == ')') {
                    System.out.println(i);
                }
            }
        }

        input.close();
    } 
}

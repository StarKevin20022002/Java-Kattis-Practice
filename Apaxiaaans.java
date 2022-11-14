/**
* Problem: Apaxiaaaaaaaaaaaans!
* Link: https://open.kattis.com/problems/apaxiaaans
* @author TRONG NHAN MAI
* @version 1.0, 11/15/2022
*
* Method : Compare 2 consecutive characters
* Status : Accepted
* Runtime: 0.10
*/


import java.util.Scanner;

public class Apaxiaaans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String test = input.next();
        
        for(int i = 0; i < test.length(); i++) {
            if(i == 0) {
                System.out.print(test.charAt(i)); // print the first character, of course
            } else if(test.charAt(i) != test.charAt(i-1)) {
                System.out.print(test.charAt(i)); // 2 consec. characters are diff. => print the latter
            } // 2 consec. characters are the same => skip
        }

        input.close();
    }
}

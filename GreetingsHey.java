/**
* Problem: Greetings!
* Link: https://open.kattis.com/problems/greetings2
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.12
*/

import java.util.Scanner;

public class GreetingsHey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String test = input.next();
        int e_count = 0;

        /** count no. of letter e in original text */
        for(int i = 0; i < test.length(); i++) {
            if(test.charAt(i) == 'e') {
                e_count++;
            }
        }

        /** print new text based on no. of letter e above */
        System.out.print('h');
        for(int j = 0; j < e_count * 2; j++) {
            System.out.print('e');
        }
        System.out.print('y');

        input.close();
    }
}

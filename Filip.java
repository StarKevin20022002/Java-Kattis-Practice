/**
* Problem: Filip
* Link: https://open.kattis.com/problems/filip
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.11
*/

import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int i;
        int j;

        /** convert 2 numbers to strings */
        String string1 = Integer.toString(num1);
        String string2 = Integer.toString(num2);

        /** "compare" 2 numbers */
        for(i = string1.length() - 1; i >= 0; i--) {
            if((int)string1.charAt(i) > (int)string2.charAt(i)) {
                for(j = string1.length() - 1; j >= 0; j--) {
                    System.out.print(string1.charAt(j));
                }
                break;
            } else if((int)string1.charAt(i) < (int)string2.charAt(i)) {
                for(j = string2.length() - 1; j >= 0; j--) {
                    System.out.print(string2.charAt(j));
                }
                break;
            } else {
                continue;
            }
        }

        input.close();
    }
}

/**
* Problem: Detailed Differences
* Link: https://open.kattis.com/problems/detaileddifferences
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.22
*/

import java.util.Scanner;

public class DetailedDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        String string1 = "";
        String string2 = "";
        int i, j;

        /** check the differences between two strings */
        for(i = 0; i < cases; i++) {
            string1 = input.next();
            string2 = input.next();
            System.out.println(string1);
            System.out.println(string2);
            for(j = 0; j < string1.length(); j++) {
                if(string1.charAt(j) != string2.charAt(j)) {
                    System.out.print('*');
                } else {
                    System.out.print('.');
                }
            }
            System.out.println("");
            System.out.println("");
            string1 = "";
            string2 = "";
        }

        input.close();
    }
}

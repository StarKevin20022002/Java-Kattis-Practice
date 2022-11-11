/**
* Problem: Jumbo Javelin
* Link: https://open.kattis.com/problems/jumbojavelin
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class JumboJavelin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int javelin = input.nextInt();
        int length = 0;
        int i;

        /** calculate merged javelin length */
        for(i = 0; i < javelin; i++) {
            length += input.nextInt();
        }
        length = length - (javelin - 1);

        /** print the result */
        System.out.println(length);

        input.close();
    }
}

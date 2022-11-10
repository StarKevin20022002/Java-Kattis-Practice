/**
* Problem: Which is Greater?
* Link: https://open.kattis.com/problems/whichisgreater
* @author TRONG NHAN MAI
* @version 1.0, 11/10/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        /** compare two numbers */
        if(a > b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        input.close();
    }
}

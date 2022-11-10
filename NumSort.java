/**
* Problem: Sort Two Numbers
* Link: https://open.kattis.com/problems/sorttwonumbers
* @author TRONG NHAN MAI
* @version 1.0, 11/10/2022
*
* Method : Bubble sort
* Status : Accepted
* Runtime: 0.13
*/

import java.util.Scanner;

public class NumSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int temp = 0;

        /** bubble sort */
        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println(a + " " + b);

        input.close();
    }
}

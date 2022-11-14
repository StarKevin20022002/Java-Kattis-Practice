/**
* Problem: Add Two Numbers
* Link: https://open.kattis.com/problems/addtwonumbers
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.16
*/

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a + b;
        System.out.println(sum);

        input.close();
    }
}

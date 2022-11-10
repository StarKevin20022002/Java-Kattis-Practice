/**
* Problem: Two Sum
* Link: https://open.kattis.com/problems/twosum
* @author TRONG NHAN MAI
* @version 1.0, 11/10/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        /** calculate the sum */
        for(int i = 0; i < 2; i++) {
            sum += input.nextInt();
        }

        /** print the result */
        System.out.println(sum);

        input.close();
    }
}

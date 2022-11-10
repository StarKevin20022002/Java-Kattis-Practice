/**
* Problem: N-sum
* Link: https://open.kattis.com/problems/nsum
* @author TRONG NHAN MAI
* @version 1.0, 11/10/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class NSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int adder = input.nextInt();
        
        /** add multiple numbers */
        int sum = 0;
        for(int i = 0; i < adder; i++) {
            sum += input.nextInt();
        }

        /** print result */
        System.out.println(sum);

        input.close();
    }
}

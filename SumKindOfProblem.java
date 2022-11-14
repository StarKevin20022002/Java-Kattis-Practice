/**
* Problem: Sum Kind of Problem
* Link: https://open.kattis.com/problems/sumkindofproblem
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : Gauss method, and general formulas
* Status : Accepted
* Runtime: 0.60
*/

import java.util.Scanner;

public class SumKindOfProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        int dataset;
        int number;
        int sum_consec = 0;
        int sum_odd = 0;
        int sum_even = 0;

        for(int i = 0; i < cases; i++) {
            dataset = input.nextInt();
            number = input.nextInt();
            System.out.print(dataset + " ");

            /** sum of n consec. nums (Gauss method) */
            if(number % 2 == 0) {
                sum_consec = (1 + number) * (number / 2);
            } else {
                sum_consec = (1 + number) * (int)Math.floor(number / 2) + (int)Math.ceil(number / 2) + 1;
            }
            System.out.print(sum_consec + " ");

            /** sum of first n odd nums (n^2 method) */
            sum_odd = (int)Math.pow(number, 2);
            System.out.print(sum_odd + " ");

            /** sum of first n even nums (n*(n+1) method) */
            sum_even = number * (number + 1);
            System.out.println(sum_even);

            /** reset */
            sum_consec = 0;
            sum_odd = 0;
            sum_even = 0;
        }

        input.close();
    }
}

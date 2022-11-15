/**
* Problem: Reverse
* Link: https://open.kattis.com/problems/ofugsnuid
* @author TRONG NHAN MAI
* @version 1.0, 11/15/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.96
*/

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        int[] num_list = new int[cases];

        /** input numbers */
        for(int i = 0; i < cases; i++) {
            num_list[i] = input.nextInt();
        }

        /** print array in reverse order */
        for(int i = cases - 1; i >= 0; i--) {
            System.out.println(num_list[i]);
        }

        input.close();
    }
}

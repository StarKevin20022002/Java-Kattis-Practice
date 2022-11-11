/**
* Problem: Pot
* Link: https://open.kattis.com/problems/pot
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int adder = input.nextInt();
        int temp_num = 0;
        int remainder = 0;
        int sum = 0;
        int i;

        /** calculate the initial sum */
        for(i = 0; i < adder; i++) {
            temp_num = input.nextInt();
            remainder = temp_num % 10;
            sum += Math.pow(((temp_num - remainder)/10), remainder);
            temp_num = 0;
            remainder = 0;
        }

        /** print result */
        System.out.println(sum);

        input.close();
    }
}

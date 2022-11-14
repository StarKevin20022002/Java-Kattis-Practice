/**
* Problem: FizzBuzz
* Link: https://open.kattis.com/problems/fizzbuzz
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : finding LCM of two given nums
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class FizzBuzz {
    public static int lcm(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        int absNum1 = Math.abs(num1);
        int absNum2 = Math.abs(num2);
        int absHigherNum = Math.max(absNum1, absNum2);
        int absLowerNum = Math.min(absNum1, absNum2);
        int lcm = absHigherNum;
        while (lcm % absLowerNum != 0) {
            lcm += absHigherNum;
        }
        return lcm;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int div1 = input.nextInt();
        int div2 = input.nextInt();
        int limit = input.nextInt();

        for(int i = 1; i < limit + 1; i++) {
            if(i % lcm(div1, div2) == 0) {
                System.out.println("FizzBuzz");
            } else if(i % div1 == 0) {
                System.out.println("Fizz");
            } else if(i % div2 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        input.close();
    }
}

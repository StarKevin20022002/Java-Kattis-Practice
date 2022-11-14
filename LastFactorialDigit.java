/**
* Problem: Last Factorial Digit
* Link: https://open.kattis.com/problems/lastfactorialdigit
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class LastFactorialDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        int value;

        for(int i = 0; i < cases; i++) {
            value = input.nextInt();
            switch(value) {
                case 1:
                    System.out.println(1);
                    break;

                case 2:
                    System.out.println(2);
                    break;

                case 3:
                    System.out.println(6);
                    break;

                case 4:
                    System.out.println(4);
                    break;

                default:
                    System.out.println(0);
                    break;
            }
        }

        input.close();
    }
}

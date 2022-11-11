/**
* Problem: Chanukah Challenge
* Link: https://open.kattis.com/problems/chanukah
* @author TRONG NHAN MAI
* @version 1.0, 11/12/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.69
*/

import java.util.Scanner;

public class Chanukah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        int no;
        int day;
        int candle = 0;
        int i, j;

        /** calculate number of candles */
        for(i = 0; i < cases; i++) {
            no = input.nextInt();
            day = input.nextInt();
            System.out.print(no + " ");
            for(j = 1; j <= day; j++) {
                candle += j;
            }
            candle += day;
            System.out.println(candle);

            candle = 0;
        }

        input.close();
    }
}

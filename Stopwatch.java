/**
* Problem: Stopwatch
* Link: https://open.kattis.com/problems/stopwatch
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.14
*/

import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int beep = input.nextInt();
        int i;
        int first_beep = 0;
        int second_beep = 0;
        int time = 0;

        if(beep % 2 != 0) {
            System.out.println("still running");
        } else {
            for(i = 0; i < beep/2; i++) {
                first_beep = input.nextInt();
                second_beep = input.nextInt();
                time += second_beep - first_beep;
                first_beep = 0;
                second_beep = 0;
            }
            System.out.println(time);
        }

        input.close();
    }
}

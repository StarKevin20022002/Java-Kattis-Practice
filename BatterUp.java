/**
* Problem: Batter Up
* Link: https://open.kattis.com/problems/batterup
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.12
*/

import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int at_bat = input.nextInt();
        int count = at_bat;
        int hit;
        int point = 0;
        double slugging = 0.0;

        for(int i = 0; i < at_bat; i++) {
            hit = input.nextInt();
            if(hit == -1) {
                count--;
            } else {
                point += hit;
            }
        }

        slugging = (double)point / (double)count;
        System.out.println(slugging);

        input.close();
    }
}

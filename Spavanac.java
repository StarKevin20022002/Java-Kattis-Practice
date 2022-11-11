/**
* Problem: Spavanac
* Link: https://open.kattis.com/problems/spavanac
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.13
*/

import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour_before = input.nextInt();
        int minute_before = input.nextInt();
        int hour_after = 0;
        int minute_after = 0;

        if(minute_before >= 45) {
            minute_after = minute_before - 45;
            System.out.println(hour_before + " " + minute_after);

        } else {
            minute_after = minute_before + 60 - 45;
            if(hour_before == 0) {
                hour_after = hour_before + 24 - 1;
            } else {
                hour_after = hour_before - 1;
            }
            System.out.println(hour_after + " " + minute_after);
        }

        input.close();
    }
}

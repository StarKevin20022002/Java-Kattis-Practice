/**
* Problem: Sibice
* Link: https://open.kattis.com/problems/sibice
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = input.nextInt();
        int width = input.nextInt();
        int length = input.nextInt();
        int match_length = 0;
        int i;

        for(i = 0; i < matches; i++) {
            match_length = input.nextInt();
            if((double)match_length <= Math.sqrt(Math.pow((double) width, 2) + Math.pow((double) length, 2))) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
            match_length = 0;
        }

        input.close();
    }
}

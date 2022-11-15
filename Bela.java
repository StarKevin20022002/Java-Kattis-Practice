/**
* Problem: Bela
* Link: https://open.kattis.com/problems/bela
* @author TRONG NHAN MAI
* @version 1.0, 11/15/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.14
*/

import java.util.Scanner;

public class Bela {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt() * 4;
        String suit = input.next();
        int point = 0;

        for(int i = 0; i < cases; i++) {
            String card = input.next();

            /** check availability of number and suit */
            if(card.contains("A")) {
                point += 11;

            } else if(card.contains("K")) {
                point += 4;

            } else if(card.contains("Q")) {
                point += 3;

            } else if(card.contains("T")) {
                point += 10;

            } else if(card.contains("9" + suit)) {
                point += 14;

            } else if(card.contains("J")) {
                if(card.contains(suit)) {
                    point += 20;
                } else {
                    point += 2;
                }
            }
        } // the rest will be ignored because they do not have any points

        System.out.println(point);
        input.close();
    }
}

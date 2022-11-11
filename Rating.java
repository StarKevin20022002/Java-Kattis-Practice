/**
* Problem: Rating Problems
* Link: https://open.kattis.com/problems/ratingproblems
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.14
*/

import java.util.Scanner;

public class Rating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int judge = input.nextInt();
        int voted = input.nextInt();
        int point = 0;
        double worst = 0.0;
        double best = 0.0;
        int i;

        /** calculate voted points */
        for(i = 0; i < voted; i++) {
            point += input.nextInt();
        }

        /** calculate worst avg. points */
        worst = ((double)point + (judge - voted) * (-3)) / judge;

        /** calculate best avg. points */
        best = ((double)point + (judge - voted) * 3) / judge;

        /** print out results */
        System.out.println(worst + " " + best);

        input.close();
    }
}

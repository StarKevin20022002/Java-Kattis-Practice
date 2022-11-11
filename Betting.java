/**
* Problem: Betting
* Link: https://open.kattis.com/problems/betting
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.11
*/

import java.util.Scanner;

public class Betting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double percentage = input.nextDouble();

        double win_odd = 100/percentage;
        double lose_odd = 100/(100 - percentage);

        System.out.println(win_odd);
        System.out.println(lose_odd);

        input.close();
    }
}

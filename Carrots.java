/**
* Problem: Solving for Carrots
* Link: https://open.kattis.com/problems/carrots
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class Carrots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int team = input.nextInt();
        int problem = input.nextInt();
        int carrots = problem;

        team = team + problem - carrots;
        System.out.println(carrots);

        input.close();
    }   
}

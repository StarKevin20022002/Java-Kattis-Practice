/**
* Problem: Ladder
* Link: https://open.kattis.com/problems/ladder
* @author TRONG NHAN MAI
* @version 1.0, 11/08/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer height = input.nextInt();
        Integer angle = input.nextInt();
        
        double ladder = height/(Math.sin(Math.toRadians((double) angle)));
        System.out.println((int) Math.ceil(ladder));

        input.close();
    }
}
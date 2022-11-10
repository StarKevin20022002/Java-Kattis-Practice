/**
* Problem: Take Two Stones
* Link: https://open.kattis.com/problems/twostones
* @author TRONG NHAN MAI
* @version 1.0, 11/08/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class TwoStones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer StoneNum = input.nextInt();
        input.close();

        if(StoneNum % 2 != 0) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
    }
}

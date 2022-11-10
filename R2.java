/**
* Problem: R2
* Link: https://open.kattis.com/problems/r2
* @author TRONG NHAN MAI
* @version 1.0, 11/10/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r1 = input.nextInt();
        int S = input.nextInt();

        int r2 = 2*S - r1;
        System.out.println(r2);

        input.close();
    }
}

/**
* Problem: Planina
* Link: https://open.kattis.com/problems/planina
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int point = (int)Math.pow((Math.pow(2, n) + 1), 2);
        System.out.println(point);

        input.close();
    }
}

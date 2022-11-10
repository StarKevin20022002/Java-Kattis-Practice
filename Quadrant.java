/**
* Problem: Echo Echo Echo
* Link: https://open.kattis.com/problems/echoechoecho
* @author TRONG NHAN MAI
* @version 1.0, 11/08/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.12
*/

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer x = input.nextInt();
        Integer y = input.nextInt();

        int quad = 0;

        if(x > 0) {
            if (y > 0) {
                quad = 1;
            } else {
                quad = 4;
            }
        } else if (y > 0) {
            quad = 2;
        } else {
            quad = 3;
        }

        System.out.println(quad);
        input.close();
    }
}

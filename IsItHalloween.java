/**
* Problem: IsItHalloween.com
* Link: https://open.kattis.com/problems/isithalloween
* @author TRONG NHAN MAI
* @version 1.0, 11/08/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class IsItHalloween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month = input.next();
        int day = input.nextInt();
        input.close();
        if ((month.equals("OCT") && day == 31) || (month.equals("DEC") && day == 25)) {
            System.out.println("yup");
        } else
            System.out.println("nope");
    }
}
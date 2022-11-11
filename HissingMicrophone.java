/**
* Problem: Hissing Microphone
* Link: https://open.kattis.com/problems/hissingmicrophone
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.09
*/

import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String check = input.next();

        /** check for "ss" */
        if((Boolean)check.contains("ss") == true) {
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }

        input.close();
    }
}

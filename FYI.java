/**
* Problem: FYI
* Link: https://open.kattis.com/problems/fyi
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class FYI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int telephone = input.nextInt();

        /** convert to string and check for number 5 */
        String string_tel = Integer.toString(telephone);
        if((Boolean)string_tel.startsWith("555") == true) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        input.close();;
    }
}

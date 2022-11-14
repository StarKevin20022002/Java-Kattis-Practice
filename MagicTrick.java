/**
* Problem: Magic Trick
* Link: https://open.kattis.com/problems/magictrick
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class MagicTrick {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String test = input.next();
        int check = 1;

        for(int i = 0; i < test.length(); i++) {
            for(int j = i + 1; j < test.length(); j++) {
                if(test.charAt(i) == test.charAt(j)) {
                    check = 0;
                }
            }
        }

        System.out.println(check);
        input.close();
    }
}
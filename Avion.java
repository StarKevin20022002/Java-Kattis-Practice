/**
* Problem: Avion
* Link: https://open.kattis.com/problems/avion
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.12
*/

import java.util.Scanner;

public class Avion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        
        for(int i = 1; i < 6; i++) {
            String test = input.next();
            if(test.contains("FBI")) {
                System.out.print(i + " ");
                count++;
            }
        }

        if(count == 0) {
            System.out.println("HE GOT AWAY!");
        }

        input.close();
    }
}

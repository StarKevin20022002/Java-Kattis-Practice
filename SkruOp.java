/**
* Problem: Turn It Up!
* Link: https://open.kattis.com/problems/skruop
* @author TRONG NHAN MAI
* @version 1.0, 11/17/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.11
*/

import java.util.Scanner;

public class SkruOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int level = 7;
        int cases = input.nextInt();
        input.nextLine();
        
        for(int i = 0; i < cases; i++) {
            String command = input.nextLine();
            if(command.equals("Skru op!")) {
                if(level < 10) {
                    level++;
                } else {
                    level = 10;
                }
            } else if(command.equals("Skru ned!")) {
                if(level > 0) {
                    level--;
                } else {
                    level = 0;
                }
            }
        }

        System.out.println(level);
        input.close();
    }
}

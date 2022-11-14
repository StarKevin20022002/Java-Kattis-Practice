/**
* Problem: Cryptographer's Conundrum
* Link: https://open.kattis.com/problems/conundrum
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.09
*/

import java.util.Scanner;

public class Conundrum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String test = input.next();
        int day = 0;
        
        for(int i = 0; i < test.length(); i++) {
            int modulo = i % 3;
            switch(modulo) {
                case 0:
                    if(test.charAt(i) != 'P') {
                        day++;
                    }
                    break;
                
                case 1:
                    if(test.charAt(i) != 'E') {
                        day++;
                    }
                    break;

                case 2:
                    if(test.charAt(i) != 'R') {
                        day++;
                    }
                    break;
            }
        }

        System.out.println(day);
        input.close();
    }
}

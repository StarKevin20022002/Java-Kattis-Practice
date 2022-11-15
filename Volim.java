/**
* Problem: Volim
* Link: https://open.kattis.com/problems/volim
* @author TRONG NHAN MAI
* @version 1.0, 11/15/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class Volim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contestant = input.nextInt();
        int cases = input.nextInt();
        int time = 0;
        String answer;

        for(int i = 0; i < cases; i++) {
            time += input.nextInt();
            if(time > 210) {
                break;
            }
            answer = input.next();
            if(answer.equals("T")) {
                if(contestant < 8) {
                    contestant++;
                } else {
                    contestant = 1;
                }
            }
        }

        System.out.println(contestant);
        input.close();
    }
}

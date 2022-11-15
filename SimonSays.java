/**
* Problem: Simon Says
* Link: https://open.kattis.com/problems/simonsays
* @author TRONG NHAN MAI
* @version 1.0, 11/15/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.16
*/

import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        input.nextLine();

        for(int i = 0; i < cases; i++) {
            String command = input.nextLine();
            if(command.contains("Simon says")) {
                System.out.println(command.substring(11));
            }
        }

        input.close();
    }
}

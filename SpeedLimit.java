/**
* Problem: Speed Limit
* Link: https://open.kattis.com/problems/speedlimit
* @author TRONG NHAN MAI
* @version 1.0, 11/15/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        int velocity;
        int time = 0;
        int time_temp1 = 0;
        int time_temp2 = 0;
        int distance = 0;
        
        while(cases != -1) {
            for(int i = 0; i < cases; i++) {
                if(i == 0) {
                    velocity = input.nextInt();
                    time = time_temp1 = time_temp2 = input.nextInt();
                    distance += velocity * time;
                } else {
                    velocity = input.nextInt();
                    time_temp2 = input.nextInt();
                    time = time_temp2 - time_temp1;
                    time_temp1 = time_temp2;
                    distance += velocity * time;
                }
            }

            System.out.format("%d miles\n", distance);
            time = time_temp1 = time_temp2 = 0;
            distance = 0;
            cases = input.nextInt();
        }

        input.close();
    }
}

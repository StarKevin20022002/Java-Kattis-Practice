/**
* Problem: Stuck In A Time Loop
* Link: https://open.kattis.com/problems/timeloop
* @author TRONG NHAN MAI
* @version 1.0, 11/08/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.13
*/

import java.util.Scanner;

public class TimeLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer count = input.nextInt();

        int i = 0;
        while (i < count) {
            int num = i + 1;
            System.out.print(num + " ");
            System.out.println("Abracadabra");
            ++i;
        }

        input.close();
    }
}
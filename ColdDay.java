/**
* Problem: Cold-puter Science
* Link: https://open.kattis.com/contests/mjt68e/problems/cold
* @author TRONG NHAN MAI
* @version 1.0, 11/10/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.11
*/

import java.util.Scanner;

public class ColdDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day;
        int cold_day = 0;

        /**Count cold days */
        day = input.nextInt();
        for(int i = 0; i < day; i++) {
            if(input.nextInt() < 0) {
                cold_day++;
            }
        }

        /**Print result */
        System.out.println(cold_day);

        input.close();
    }
}

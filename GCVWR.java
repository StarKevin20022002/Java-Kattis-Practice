/**
* Problem: GCVWR
* Link: https://open.kattis.com/problems/gcvwr
* @author TRONG NHAN MAI
* @version 1.0, 11/12/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class GCVWR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int truck_rating = input.nextInt();
        int truck_weight = input.nextInt();
        int item = input.nextInt();
        int towing_cap = 0;
        int item_weight = 0;
        int pull_weight = 0;
        int i;

        /** calculate pull weight */
        towing_cap = (truck_rating - truck_weight) * 9 / 10;
        for(i = 0; i < item; i++) {
            item_weight += input.nextInt();
        }
        pull_weight = towing_cap - item_weight;
        System.out.println(pull_weight);

        input.close();
    }
}

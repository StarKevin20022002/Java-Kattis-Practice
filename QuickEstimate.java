/**
* Problem: Quick Estimates
* Link: https://open.kattis.com/problems/quickestimate
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.11
*/

import java.util.Scanner;

public class QuickEstimate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        
        for(int i = 0; i < cases; i++) {
            String price = input.next();
            System.out.println(price.length());
        }

        input.close();
    }
}

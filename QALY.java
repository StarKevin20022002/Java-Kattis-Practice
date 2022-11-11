/**
* Problem: Quality-Adjusted Life-Year
* Link: https://open.kattis.com/problems/qaly
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.15
*/

import java.util.Scanner;

public class QALY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int period = input.nextInt();
        double rating = 0.0;
        double year = 0.0;
        double QALY = 0.0;
        int i;

        for(i = 0; i < period; i++) {
            rating = input.nextDouble();
            year = input.nextDouble();
            QALY += rating * year;
            rating = 0.0;
            year = 0.0;
        }

        System.out.println(QALY);

        input.close();
    }
}

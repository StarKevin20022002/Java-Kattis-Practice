/**
* Problem: Pet
* Link: https://open.kattis.com/problems/pet
* @author TRONG NHAN MAI
* @version 1.0, 11/15/2022
*
* Method : Array list
* Status : Accepted
* Runtime: 0.13
*/

import java.util.*;
import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer>point = new ArrayList<Integer>();
        int indi_sum = 0;
        int place;
        int temp;

        /** calculate individual points */
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                indi_sum += input.nextInt();
            }
            point.add(indi_sum);
            indi_sum = 0;
        }

        /** compare results */
        place = 1;
        temp = point.get(0);
        for(int a = 1; a < 5; a++) {
            if(point.get(a) > temp) {
                place = a + 1;
                temp = point.get(a);
            }
        }

        /** print output */
        System.out.println(place + " " + temp);

        input.close();
    }
}

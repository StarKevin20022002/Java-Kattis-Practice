/**
* Problem: Kornislav
* Link: https://open.kattis.com/problems/kornislav
* @author TRONG NHAN MAI
* @version 1.0, 11/15/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;
import java.util.*;

public class Kornislav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] size = new int[4];

        for(int i = 0; i < 4; i++) {
            size[i] = input.nextInt();
        }

        Arrays.sort(size);
        int area = size[0] * size[2];
        System.out.println(area);

        input.close();
    }
}

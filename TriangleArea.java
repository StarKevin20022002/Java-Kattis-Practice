/**
* Problem: Triangle Area
* Link: https://open.kattis.com/problems/triarea
* @author TRONG NHAN MAI
* @version 1.0, 11/10/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        int base = input.nextInt();

        /** calculate the area */
        double area = ((double)height * (double)base) / 2;
        System.out.println(area);

        input.close();
    }
}

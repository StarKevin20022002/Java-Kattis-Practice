/**
* Problem: Cetvrta
* Link: https://open.kattis.com/problems/cetvrta
* @author TRONG NHAN MAI
* @version 1.0, 11/15/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.12
*/

import java.util.*;

public class Cetvrta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer>x_axis = new ArrayList<Integer>();
        List<Integer>y_axis = new ArrayList<Integer>();

        /** insert given points */
        for(int i = 0; i < 3; i++) {
            x_axis.add(input.nextInt());
            y_axis.add(input.nextInt());
        }

        /** print x-axis */
        if(x_axis.get(0) == x_axis.get(1)) {
            System.out.print(x_axis.get(2) + " ");
        } else if(x_axis.get(0) == x_axis.get(2)) {
            System.out.print(x_axis.get(1) + " ");
        } else {
            System.out.print(x_axis.get(0) + " ");
        }

        /** print y-axis */
        if(y_axis.get(0) == y_axis.get(1)) {
            System.out.println(y_axis.get(2));
        } else if(y_axis.get(0) == y_axis.get(2)) {
            System.out.println(y_axis.get(1));
        } else {
            System.out.println(y_axis.get(0));
        }

        input.close();
    }
}

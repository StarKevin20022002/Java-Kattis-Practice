/**
* Problem: Password Hacking
* Link: https://open.kattis.com/problems/password
* @author TRONG NHAN MAI
* @version 1.0, 11/15/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.20
*/

import java.util.Scanner;
import java.util.*;

public class PassworkHacking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        double exp_value = 0.0;
        double[] prob = new double[cases];
        int attempt = 1;

        for(int i = 0; i < cases; i++) {
            String password = input.next();
            prob[i] = input.nextDouble();
            if(password != "") {
                password = "";
            }
        }

        Arrays.sort(prob);

        for(int j = cases - 1; j >= 0; j--) {
            exp_value += attempt * prob[j];
            attempt++;
        }

        System.out.format("%.4f", exp_value);
        input.close();
    }
}
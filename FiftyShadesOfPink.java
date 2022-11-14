/**
* Problem: Fifty Shades of Pink
* Link: https://open.kattis.com/problems/fiftyshades
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.14
*/

import java.util.Scanner;

public class FiftyShadesOfPink {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        int count = 0;

        /** input and check for pink or rose */
        for(int i = 0; i < cases; i++) {
            String test = input.next();
            test = test.toLowerCase();
            if(test.contains("pink") || test.contains("rose")) {
                count++;
            }
        }

        /** print the result */
        if(count == 0) {
            System.out.println("I must watch Star Wars with my daughter");
        } else {
            System.out.println(count);
        }

        input.close();
    }
}

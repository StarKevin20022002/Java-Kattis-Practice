/**
* Problem: Finding An A
* Link: https://open.kattis.com/problems/findingana
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.11
*/

import java.util.Scanner;

public class FindingAnA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String check = input.next();
        int search;
        int found = 0;

        for(search = 0; search < check.length(); search++) {
            if(check.charAt(search) == 'a') {
                found = search;
                break;
            }
        }

        while(found < check.length()) {
            System.out.print(check.charAt(found));
            found++;
        }

        input.close();
    }
}

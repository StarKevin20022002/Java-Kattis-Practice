/**
* Problem: No Duplicates
* Link: https://open.kattis.com/problems/nodup
* @author TRONG NHAN MAI
* @version 1.0, 11/23/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.09
*/

import java.util.Scanner;
import java.util.*;

public class NoDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] test = input.nextLine().split(" ");
        HashSet<String> check = new HashSet<>(Arrays.asList(test));
        System.out.println(test.length == check.size() ? "yes" : "no");

        input.close();
    }
}

/**
* Problem: Count the Vowels
* Link: https://open.kattis.com/problems/countthevowels
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class CountTheVowels {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String test = input.next();
       test = test.toLowerCase();
       int count = 0;

       char ch[] = test.toCharArray();
       for(int k = 0; k < ch.length; k++) {
           if(ch[k] == 'a' || ch[k] == 'e' || ch[k] == 'i' || ch[k] == 'o' || ch[k] == 'u') {
                count++;
            }
       }

       System.out.println(count);
       input.close();
   } 
}

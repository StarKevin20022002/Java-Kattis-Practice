/**
* Problem: Alphabet Spam
* Link: https://open.kattis.com/problems/alphabetspam
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.16
*/

import java.util.Scanner;

public class AlphabetSpam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int space_count = 0;
        int lower_count = 0;
        int upper_count = 0;
        int other_count = 0;
 
        /** count character */
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper_count++;
            else if (ch >= 'a' && ch <= 'z')
                lower_count++;
            else if (ch == '_')
                space_count++;
            else
                other_count++;
        }
 
        /** calculate and print percentage */
        System.out.println((double)space_count/str.length());
        System.out.println((double)lower_count/str.length());
        System.out.println((double)upper_count/str.length());
        System.out.println((double)other_count/str.length());

        input.close();
    }
}

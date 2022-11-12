/**
* Problem: Encoded Message
* Link: https://open.kattis.com/problems/encodedmessage
* @author TRONG NHAN MAI
* @version 1.0, 11/12/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.83
*/

import java.util.Scanner;

public class EncodedMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        int i, char_pointer, lock;

        for(i = 0; i < cases; i++) {
            String test = input.next();
            int sqrt = (int)Math.sqrt((double)test.length());
            for(char_pointer = sqrt - 1; char_pointer >= 0; char_pointer--) {
                lock = char_pointer;
                while(char_pointer < test.length()) {
                    System.out.print(test.charAt(char_pointer));
                    char_pointer += sqrt;
                }
                char_pointer = lock;
            }
            System.out.println("");
            test = "";
        }

        input.close();
    }
}

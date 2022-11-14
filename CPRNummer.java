/**
* Problem: CPR Number
* Link: https://open.kattis.com/problems/cprnummer
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.12
*/

import java.util.Scanner;

public class CPRNummer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String test = input.next();
        int sum = 0;

        for(int i = 0; i < test.length(); i++) {
            switch(i) {
                case 0:
                    sum += Character.getNumericValue(test.charAt(i)) * 4;
                    break;

                case 1:
                    sum += Character.getNumericValue(test.charAt(i)) * 3;
                    break;

                case 2:
                    sum += Character.getNumericValue(test.charAt(i)) * 2;
                    break;

                case 3:
                    sum += Character.getNumericValue(test.charAt(i)) * 7;
                    break;

                case 4:
                    sum += Character.getNumericValue(test.charAt(i)) * 6;
                    break;

                case 5:
                    sum += Character.getNumericValue(test.charAt(i)) * 5;
                    break;

                case 7:
                    sum += Character.getNumericValue(test.charAt(i)) * 4;
                    break;

                case 8:
                    sum += Character.getNumericValue(test.charAt(i)) * 3;
                    break;

                case 9:
                    sum += Character.getNumericValue(test.charAt(i)) * 2;
                    break;

                case 10:
                    sum += Character.getNumericValue(test.charAt(i)) * 1;
                    break;

                default:
                    break;
                }   
            }

        if(sum % 11 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        input.close();
    }
}
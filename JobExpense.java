/**
* Problem: Job Expenses
* Link: https://open.kattis.com/problems/jobexpenses
* @author TRONG NHAN MAI
* @version 1.0, 11/11/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.27
*/

import java.util.Scanner;

public class JobExpense {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int list = input.nextInt();
        int temp;
        int balance = 0;
        int i;

        for(i = 0; i < list; i++) {
            temp = input.nextInt();
            if(temp < 0) {
                balance += temp * (-1);
            }
            temp = 0;
        }

        System.out.println(balance);

        input.close();
    }
}

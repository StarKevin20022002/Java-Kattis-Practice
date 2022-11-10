/**
* Problem: Faktor
* Link: https://open.kattis.com/problems/faktor
* @author TRONG NHAN MAI
* @version 1.0, 11/10/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer article = input.nextInt();
        Integer score = input.nextInt();
        
        int scientist = article * (score - 1) + 1;
        System.out.println(scientist);

        input.close();
    }
}

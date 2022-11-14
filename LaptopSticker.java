/**
* Problem: Laptop Sticker
* Link: https://open.kattis.com/problems/laptopsticker
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10
*/

import java.util.Scanner;

public class LaptopSticker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int laptop_width = input.nextInt();
        int laptop_height = input.nextInt();
        int sticker_width = input.nextInt();
        int sticker_height = input.nextInt();

        if((laptop_width - sticker_width) < 2 || (laptop_height - sticker_height) < 2) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }

        input.close();
    }
}

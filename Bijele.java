/**
* Problem: Bijele
* Link: https://open.kattis.com/problems/bijele
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : List
* Status : Accepted
* Runtime: 0.12
*/

import java.util.Scanner;
import java.util.*;

public class Bijele {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /** intialize chess pieces */
        Integer[] ch = {1, 1, 2, 2, 2, 8};
        List<Integer>chess = Arrays.asList(ch);

        /** input available pieces */
        List<Integer>available = new ArrayList<Integer>();
        for(int i = 0; i < chess.size(); i++) {
            available.add(input.nextInt());
        }

        /** calculate missing pieces */
        List<Integer>missing = new ArrayList<Integer>();
        for(int j = 0; j < chess.size(); j++) {
            missing.add(chess.get(j) - available.get(j));
            System.out.print(missing.get(j) + " ");
        }

        input.close();
    }
}

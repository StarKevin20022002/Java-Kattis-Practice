/**
* Problem: I've Been Everywhere, Man
* Link: https://open.kattis.com/problems/everywhere
* @author TRONG NHAN MAI
* @version 1.0, 11/14/2022
*
* Method : List + Hash Set
* Status : Accepted
* Runtime: 0.15
*/

import java.util.Scanner;
import java.util.*;

public class IHaveBeenEverywhere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        for(int i = 0; i < cases; i++) {
            /** create city list */
            int place = input.nextInt();
            List<String>city = new ArrayList<String>();
            for(int j = 0; j < place; j++) {
                city.add(input.next());
            }

            /** create hash set to count unduplicated cases */
            List<String> reduced = new ArrayList<>(new HashSet<>(city));
            System.out.println(reduced.size());

            /** clear data for new case */
            city.clear();
            reduced.clear();
        }

        input.close();
    }
}

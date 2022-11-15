/**
* Problem: Secure Doors
* Link: https://open.kattis.com/problems/securedoors
* @author TRONG NHAN MAI
* @version 1.0, 11/15/2022
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.21
*/

import java.util.Scanner;
import java.util.*;

public class SecureDoor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        List<String> name_list = new ArrayList<String>();

        for(int i = 0; i < cases; i++) {
            String state = input.next();
            String name = input.next();
            if(!name_list.contains(name) && state.equals("entry")) {
                System.out.format("%s entered\n", name);
                name_list.add(name);
            } else if(!name_list.contains(name) && state.equals("exit")) {
                System.out.format("%s exited (ANOMALY)\n", name);
            } else if(name_list.contains(name) && state.equals("entry")) {
                System.out.format("%s entered (ANOMALY)\n", name);
            } else if(name_list.contains(name) && state.equals("exit")) {
                System.out.format("%s exited\n", name);
                name_list.remove(name);
            }
        }

        input.close();
    }
}

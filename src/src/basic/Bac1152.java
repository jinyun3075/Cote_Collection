package src.basic;

import java.util.Scanner;

public class Bac1152 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] val = sc.nextLine().split(" ");
        int v =val.length;
        for(String a : val){
            if(a.equals("")){
                v--;
            }
        }
        System.out.println(v);
    }
}

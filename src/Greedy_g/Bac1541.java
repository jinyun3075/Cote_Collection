package Greedy_g;

import java.util.Scanner;

public class Bac1541 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\-");
        int val = add(input[0]);
        for(int i=1 ; i<input.length;i++){
            val-=add(input[i]);
        }
        System.out.println(val);
    }
    static int add(String input){
        int result=0;
        String[] sum = input.split("\\+");
        for(String s :sum){
            result+=Integer.parseInt(s);
        }
        return result;
    }
}

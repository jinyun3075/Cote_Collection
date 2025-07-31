package Greedy_g;

import java.util.Scanner;

public class Bac10162 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] time = {300,60,10};
        int[] val= new int[3];
        if(input%10>0){
            System.out.print(-1);
            System.exit(1);
        }
        for(int i=0;i<time.length;i++){
            val[i]=input/time[i];
            input%=time[i];
            System.out.print(val[i]+" ");
        }
    }
}


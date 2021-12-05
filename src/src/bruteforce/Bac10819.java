package src.bruteforce;

import java.util.Scanner;

public class Bac10819 {
    static boolean ch[];
    static int arr[];
    static int n;
    static int[] val;
    static int max=0;
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        n =sc.nextInt();
        ch=new boolean[n];
        arr= new int[n];
        val= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        logic(0);
        System.out.println(max);


    }
    static void logic(int l){
        if(l==n){
            int sum =0;
            for(int i=0;i<n-1;i++){
                sum+=Math.abs(val[i]-val[i+1]);
            }
            max=Math.max(max,sum);
            return;
        }
        for(int i=0;i<n;i++){
            if(!ch[i]){
                ch[i]=true;
                val[l]=arr[i];
                logic(l+1);
                ch[i]=false;

            }
        }
    }
}

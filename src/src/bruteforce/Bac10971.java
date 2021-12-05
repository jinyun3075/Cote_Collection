package src.bruteforce;

import java.util.Scanner;

public class Bac10971 {
    static boolean ch[];
    static int arr[][];
    static int n;
    static int[] val;
    static int min =Integer.MAX_VALUE;
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        n =sc.nextInt();
        ch=new boolean[n];
        arr= new int[n][n];
        val= new int[n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

            logic(0);

        System.out.println(min);


    }
    static void logic(int l){
        if(l==n){
            int sum =0;
            for(int i=0;i<n-1;i++){
                if(arr[val[i]][val[i+1]]==0) return;

                sum+=arr[val[i]][val[i+1]];
            }
            if(arr[val[n-1]][val[0]]==0){
                return;
            }
            sum+=arr[val[n-1]][val[0]];
            min=Math.min(min,sum);
            return;
        }
        for(int i=0;i<n;i++){
            if(!ch[i]){
                ch[i]=true;
                val[l]=i;
                logic(l+1);
                ch[i]=false;

            }
        }
    }
}

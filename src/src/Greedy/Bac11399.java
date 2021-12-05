package src.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Bac11399 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int P[] =new int[N];
        int i=0;
        int val=0;
        for(int a=0;a<N;a++){
            P[a]=sc.nextInt();
        }

        Arrays.sort(P);
        for(int a : P){
            i+=a;
            val+=i;
        }
        System.out.println(val);
    }
}

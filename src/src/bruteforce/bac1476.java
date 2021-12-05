package src.bruteforce;

import java.util.Scanner;

public class bac1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();
        int te=1,ts=1,tm=1;

        for(int val=1;;val++){
            if(e==te&&s==ts&&m==tm){
                System.out.println(val);
                break;
            }
            te+=1;
            ts+=1;
            tm+=1;
            if(te==16) te=1;
            if(ts==29) ts=1;
            if(tm==20) tm=1;

        }
    }
}

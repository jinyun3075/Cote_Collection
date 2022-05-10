package bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class Bac15657 {
    static int N;
    static int M;
    static int[] inputArr;
    static int[] checkArr;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        inputArr = new int[N];
        checkArr = new int[M];
        for(int i=0;i<N;i++) {
            inputArr[i] = sc.nextInt();
        }
        Arrays.sort(inputArr);
        logic(0,0);
        System.out.println(sb);
    }
    static StringBuilder sb = new StringBuilder();
    public static void logic(int checkIdx,int idx) {
        if(checkIdx==M) {
            for(int i =0 ;i<checkIdx;i++) {
                sb.append(checkArr[i]+" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = idx;i< inputArr.length;i++) {
            checkArr[checkIdx]=inputArr[i];
            logic(checkIdx+1,i);
        }
    }

}

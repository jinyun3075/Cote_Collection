package bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class Bac2309 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int m[] = new int[9];
        int val=0;
        for(int i=0;i<m.length;i++){
            m[i]=sc.nextInt();
            val+=m[i];
        }
        boolean ch =false;
        Arrays.sort(m);
        for(int i=0;i<9;i++){
            for(int j=i+1;j<9;j++){
                if(val-m[i]-m[j]==100){
                    for(int z=0;z<9;z++){
                        if(z==i||z==j){
                            continue;
                        }
                        sb.append(m[z]).append('\n');
                    }
                    ch=true;
                    break;
                }
            }
            if(ch) break;
        }
        System.out.println(sb);
    }
}

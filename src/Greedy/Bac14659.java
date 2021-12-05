package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bac14659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int val=0;
        int k=0;
        String hanjo[] = bf.readLine().split(" ");
        int kill=0;
        for(int i=1;i<N;i++){
            if(Integer.parseInt(hanjo[k])>Integer.parseInt(hanjo[i])){
                kill++;
            }else{
                val=Math.max(val,kill);
                kill=0;
                k=i;
            }
        }
        val=Math.max(val,kill);
        System.out.println(val);

    }
}

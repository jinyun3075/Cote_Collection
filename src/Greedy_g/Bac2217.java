package Greedy_g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Bac2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        Integer [] w = new Integer[N];

        for(int i=0;i<N;i++){
            w[i]=Integer.parseInt(bf.readLine());
        }
        Arrays.sort(w, Collections.reverseOrder());
        int val=w[0];

        for(int i=1;i<w.length;i++){
                if(val<w[i]*(i+1)){
                    val=w[i]*(i+1);
                }
            }
        System.out.print(val);
        }
    }

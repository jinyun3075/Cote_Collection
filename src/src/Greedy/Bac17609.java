package src.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bac17609 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        int[] val = new int[T];
        for(int i=0;i<T;i++){
            char[] input = bf.readLine().toCharArray();
            int s = 0;
            int e = input.length-1;

            while(s<=e){
                if(input[s]==input[e]) {
                    s++;
                    e--;
                }else{
                    int st = s;
                    int en = e;
                    st++;
                    while (st <= en) {
                        if (input[st] == input[en]) {
                            st++;
                            en--;
                        } else {
                            val[i]++;
                            break;
                        }
                    }
                    st = s;
                    en = e;
                    en--;
                    while (st <= en) {
                        if (input[st] == input[en]) {
                            st++;
                            en--;
                        } else {
                            val[i]++;
                            break;
                        }
                    }
                    if(val[i]==0){
                        val[i]++;
                    }
                    s = e + 1;
                }

            }
        }
        for(int v :val){
            System.out.println(v);
        }
    }

}
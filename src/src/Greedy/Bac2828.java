package src.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bac2828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken())-1;
        int val=0;
        int basket=1;
        int ap = Integer.parseInt(bf.readLine());
        for(int i=0;i<ap;i++){
            int input = Integer.parseInt(bf.readLine());
            while(true){
                if(basket<=input&&input<=basket+M){
                    break;
                }else if(basket+M<input){
                    basket++;
                    val++;
                }else if(basket>input){
                    basket--;
                    val++;
                }
            }
        }
        System.out.println(val);

    }
}

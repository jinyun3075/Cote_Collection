package src.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bac2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        boolean sw = false;
        String sit = bf.readLine();
        sit=sit.replaceAll("[S]","1").replaceAll("[L][L]","2");
        for(int i=0;i<sit.length();i++){
            if(sit.charAt(i)=='2'){
                N-=1;
                sw =true;
            }
        }
        if(sw){
            System.out.println(N+1);
        }else{
            System.out.println(N);
        }
    }
}

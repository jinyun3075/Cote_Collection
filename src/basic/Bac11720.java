package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bac11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));
        int Case = Integer.parseInt(bf.readLine());
        int val=0;
        String sum = bf.readLine();
        for(int i=0;i<Case;i++){
            val+=sum.charAt(i)-'0';
        }
        System.out.println(val);
    }
}

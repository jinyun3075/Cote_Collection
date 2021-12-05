package src.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bac1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        String docu = bf.readLine();
        String serch = bf.readLine();
        int val=0;
        for(int i=0;i<=docu.length()-serch.length();){
            if(docu.substring(i,i+serch.length()).equals(serch)){
                val++;
                i+=serch.length();
            }
            else i++;
        }
        System.out.println(val);
    }
}

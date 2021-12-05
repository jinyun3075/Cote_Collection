package src.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bac15904 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] input = bf.readLine().toCharArray();
        char[] val ={'U','C','P','C'};
        int index=0;
        for(int i=0;i<input.length;i++){
            if(index>3)break;
            if(input[i]==val[index]){
                index++;
            }
        }
        if(index>3){
            System.out.println("I love UCPC");

        }else{
            System.out.println("I hate UCPC");
        }
    }
}

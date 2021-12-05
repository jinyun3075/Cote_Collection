package dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bac9251 {
    static char[] input1;
    static char[] input2;
    static Integer[][] val;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        input1 = bf.readLine().toCharArray();
        input2 = bf.readLine().toCharArray();
        val =new Integer[input1.length][input2.length];
        System.out.println(logic(input1.length-1,input2.length-1));
    }
    static int logic(int str1, int str2){
        if(str1<0||str2<0){
            return 0;
        }else if(val[str1][str2]==null){
            val[str1][str2]=0;
            if(input1[str1]==input2[str2]){
                val[str1][str2]=logic(str1-1,str2-1)+1;
            }else{
                val[str1][str2]=Math.max(logic(str1-1,str2),logic(str1,str2-1));
            }
        }
        return val[str1][str2];
    }

}

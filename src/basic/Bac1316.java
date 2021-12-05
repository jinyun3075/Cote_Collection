package basic;

import java.util.Arrays;
import java.util.Scanner;
public class Bac1316 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        boolean sw [] = new boolean[26];
        int val =index;
        String word[] = new String[index];
        for(int i =0;i<index;i++){
            word[i]=sc.next();
        }
        for(String wo : word){
        Arrays.fill(sw,false);
            for(int i=0;i<wo.length();i++){
                if(sw[wo.charAt(i)-'a']==true){
                    val--;
                    break;
                }
                if(wo.length()>i+1&&wo.charAt(i)!=wo.charAt(i+1)){
                    sw[wo.charAt(i)-'a']=true;
                }
            }
        }
        System.out.println(val);
    }
}

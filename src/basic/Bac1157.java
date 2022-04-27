package basic;
import java.util.Arrays;
import java.util.Scanner;

public class Bac1157 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Al = sc.next().toUpperCase();
        int in[] = new int[26];
        Arrays.fill(in,0);
        for(String a : Al.split("")){
            in[a.charAt(0)-'A']++;
        }
        int max =0;
        boolean sw=false;
        for(int i=1;i<in.length;i++){
           if(in[max]==in[i]){
               sw=true;
           }
            if(in[max]<in[i]){
               max=i;
               sw=false;
           }
        }
        if(sw==true){
            System.out.println("?");
        }else{
            System.out.println((char)('A'+max));
        }

    }
}


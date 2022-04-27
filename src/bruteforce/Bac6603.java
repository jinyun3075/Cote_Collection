package bruteforce;

import java.util.*;

public class Bac6603 {
    static int[] arr;
    static boolean ch[];
    static int k;
    static StringBuilder sb ;
    static LinkedHashSet<String> lh;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            lh = new LinkedHashSet<>();
            k =sc.nextInt();
            if(k==0){
                break;
            }
            arr=new int[k];
            ch=new boolean[k];
            for(int i=0;i<k;i++){
                arr[i]=sc.nextInt();
            }
            cut(0);
            lh.forEach((i)->System.out.println(i));
            System.out.println();
        }
    }
    static void cut(int c){
        if(c==6){
            sb = new StringBuilder();
            for(int i=0;i<k;i++){
                if(ch[i]){
                    sb.append(arr[i]).append(' ');
                }
            }
            lh.add(sb.toString());
            return;
        }
        for(int i=0;i<k;i++){
            if(!ch[i]){
                ch[i]=true;
                cut(c+1);
                ch[i]=false;
            }
        }
    }
}

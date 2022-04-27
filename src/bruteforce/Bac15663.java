package bruteforce;

import java.util.*;

public class Bac15663 {
    static boolean ch[];
    static int arr[];
    static int val[];
    static int N;
    static int M;
    static LinkedHashSet<String> lh;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        lh = new LinkedHashSet<>();
        N = sc.nextInt();
        M = sc.nextInt();
        arr=new int[N];
        val =new int[M];
        ch =new boolean[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        logic(0);
        lh.forEach((input)->System.out.println(input));

    }
    static void logic(int l){
        if(M==l){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<M;i++){
                sb.append(val[i]).append(' ');
            }
            lh.add(sb.toString());
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(ch[i]==false){
                ch[i]=true;
                val[l]=arr[i];
                logic(l+1);
                ch[i]=false;
            }
        }
    }
}
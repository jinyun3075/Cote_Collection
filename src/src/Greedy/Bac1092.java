package src.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bac1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        ArrayList<Integer> power = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0;i<N;i++){
            power.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(power,Collections.reverseOrder());

        int M = Integer.parseInt(bf.readLine());
        ArrayList<Integer> weight = new ArrayList<>();
        st =new StringTokenizer(bf.readLine());
        for(int i=0;i<M;i++){
            weight.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(weight,Collections.reverseOrder());
        int val=0;
        if(power.get(0)<weight.get(0)){
            System.out.println(-1);

        }else{
           while(weight.size()>0){
               int boxindex=0;
               int powerindex=0;
               while(powerindex<N){
                   if(weight.size()==boxindex) break;
                   if(power.get(powerindex)>=weight.get(boxindex)){
                       weight.remove(boxindex);
                       powerindex++;
                   }else{
                       boxindex++;
                   }
               }
               val++;
           }
            System.out.println(val);
        }

    }
}

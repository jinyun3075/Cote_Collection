package Greedy_g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bac13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        long val =0;
        Queue<Long> km = new LinkedList<>();
        Queue<Long> city = new LinkedList<>();

        StringTokenizer st_km =new StringTokenizer(bf.readLine());
        StringTokenizer st_city = new StringTokenizer(bf.readLine());
        while(st_km.hasMoreTokens()){
            km.offer(Long.parseLong(st_km.nextToken()));
        }
        while(st_city.hasMoreTokens()){
            city.offer(Long.parseLong(st_city.nextToken()));
        }

        Long oil = city.poll();

        while(!km.isEmpty()){
            Long nextOil = city.poll();
            val+=oil*km.poll();
            if(oil>nextOil){
                oil=nextOil;
            }
        }
        System.out.println(val);



    }
}

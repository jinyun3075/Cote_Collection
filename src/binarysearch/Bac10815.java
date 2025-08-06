package binarysearch;
import java.io.*;
import java.util.*;
public class Bac10815 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<Integer> nmap = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            nmap.add(Integer.parseInt(st.nextToken()));
        }
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M ; i++){
            int target = Integer.parseInt(st.nextToken());
            String str = "0";
            if(nmap.contains(target)) str = "1";
            sb.append(str).append(" ");
        }
        System.out.println(sb.toString());
    }
}


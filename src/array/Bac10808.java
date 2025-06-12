package array;
import java.io.*;
import java.util.*;

public class Bac10808 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] alpabet = new int[26];
        String s = st.nextToken();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            alpabet[c - 'a']++;
        }
        for(int i = 0; i < alpabet.length; i++) {
            sb.append(alpabet[i]+" ");
        }
        System.out.println(sb.toString().trim());
    }
}

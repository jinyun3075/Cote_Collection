package array;
import java.io.*;
import java.util.*;

public class Bac11328 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] result = new String[n];
        
        for(int i = 0 ; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            PriorityQueue<Character> q1 = new PriorityQueue<>();
            PriorityQueue<Character> q2 = new PriorityQueue<>();
            String input1 = st.nextToken();
            String input2 = st.nextToken();
            for(int j = 0 ; j < input1.length(); j++){
                q1.add(input1.charAt(j));
            }
            for(int j = 0 ; j < input2.length(); j++){
                q2.add(input2.charAt(j));
            }
            if(q1.size() != q2.size()) {
                result[i] = "Impossible";
            } else {
                boolean isAnagram = true;
                while(!q1.isEmpty() && !q2.isEmpty()) {
                    if(!q1.poll().equals(q2.poll())) {
                        isAnagram = false;
                        break;
                    }
                }
                result[i] = isAnagram ? "Possible" : "Impossible";
            }

        }
        for(int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}

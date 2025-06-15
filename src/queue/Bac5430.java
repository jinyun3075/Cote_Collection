package queue;
import java.io.*;
import java.util.*;
public class Bac5430 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        while(T-- > 0){
            String P = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String arr = br.readLine();
            Deque<Integer> de = new LinkedList<>();
            boolean R = true;
            boolean isError = false;
            if(n > 0){
                String[] chArr = arr.substring(1, arr.length() - 1).split((","));
                for(String ch : chArr){
                    de.add(Integer.parseInt(ch));
                }
            }
            for(String ch : P.split("")){
                if (ch.equals("R")) {
                    R = !R;
                }else if(ch.equals("D")){
                    if(de.size() == 0){
                        isError = true;
                        break;
                    }
                    else if(R){
                        de.pollFirst();
                    }else {
                        de.pollLast();
                    }
                }
            }
            if(isError){
                result.append("error");
            }else {
                result.append("[");
                while(!de.isEmpty()){
                    result.append(R ? de.pollFirst():de.pollLast());
                    if (!de.isEmpty()) result.append(",");
                }
                result.append("]");
            }
            result.append("\n");
        }
        System.out.println(result.toString().trim());

    }
}
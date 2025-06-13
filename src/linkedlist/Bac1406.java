package linkedlist;
import java.io.*;
import java.util.StringTokenizer;

public class Bac1406 {
    public void solution() throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        result.append(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int cursor = result.length();
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String ord = st.nextToken();
            String word = "";
            if(ord.equals("P")){
                word = st.nextToken();
                result.insert(cursor, word);
                cursor++;
            }else if(ord.equals("L")){
                if(cursor > 0) {
                    cursor--;
                }
            }else if (ord.equals("D")){
                if(cursor < result.length()) {
                    cursor++;
                }
            }else if(ord.equals("B")){
                if(cursor > 0) {
                    result.deleteCharAt(cursor - 1);
                    cursor--;
                }
            }
        }
        System.out.println(result.toString());
    }
}

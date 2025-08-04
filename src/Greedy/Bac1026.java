package greedy;
import java.io.*;
import java.util.*;
public class Bac1026 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] AList = new Integer[N];
        Integer[] BList = new Integer[N];
        String[] AStr = br.readLine().split(" ");
        String[] BStr = br.readLine().split(" ");
        for(int i = 0 ; i < N ;i++){
            AList[i] = Integer.parseInt(AStr[i]);
            BList[i] = Integer.parseInt(BStr[i]);
        }
        Arrays.sort(AList);
        Arrays.sort(BList, Comparator.reverseOrder());
        int result =0;
        for(int i = 0 ; i < N ;i++){
            result += AList[i] * BList[i];
        }
        System.out.println(result);
    }
}


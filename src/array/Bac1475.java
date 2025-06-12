package array;
import java.io.*;

public class Bac1475 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int n = Integer.parseInt(br.readLine());
        
        while(n > 0){
            int num = n % 10;
            arr[num]++;
            n /= 10;
        }
        arr[6] = (arr[6] + arr[9] + 1) / 2;
        arr[9] = 0;
        int highest = 0;
        
        for(int i = 0 ; i < arr.length ; i++){
            highest = Math.max(highest, arr[i]);
        }
        System.out.print(highest);
    }
}

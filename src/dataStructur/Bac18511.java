package dataStructur;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bac18511 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer[] arr = new Integer[K];
        for (int i = 0; i < K; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(solution(N, K, arr));
    }

    static public int solution(int n, int k, Integer[] arr) {
        String answer = "";
        String[] divide = (n+"").split("");
        for(int i =0 ;i<arr.length;i++) {
            if(Integer.parseInt(divide[0])>=arr[i]) {
                answer+=arr[i]+"";
                break;
            }
        }
        for(int i=1;i<k;i++) {
            answer+=arr[0]+"";
        }
        return Integer.parseInt(answer);
    }
}

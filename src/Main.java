import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[M];

        for(int i=0;i<M;i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int result1 =0;
        int result2 =0;
        for(int i=0;i<M;i++) {
            int soldValue = arr[i];
            int count = Math.min(N,M);
            int price =0;
            int sold = Math.min((M)-i,count);
            price = soldValue * sold;
            if(result2<price) {
                result1 = arr[i];
                result2 = price;
            }
        }
        System.out.println(result1+" "+result2);
    }
}
package dynamicprogramming;
import java.util.Scanner;
public class Bac2293 {
    static int dp[];
    static int m[];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        dp= new int[k+1];
        m = new int[n];
        for(int i=0;i<n;i++){
            m[i]=sc.nextInt();
        }
        dp[0]=1;

        for(int i=0;i<n;i++){
            for(int j=m[i];j<=k;j++){
                dp[j]+=dp[j-m[i]];
            }
        }
        System.out.println(dp[k]);
    }
}
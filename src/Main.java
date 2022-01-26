import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       StringBuilder sb = new StringBuilder();
       int T = sc.nextInt();
       int[] dp = new int[11];
       dp[1] = 1;
       dp[2] = 2;

       while(T-->0) {
           int n = sc.nextInt();
           for(int i = 4 ; i <= n ; i++) {
               dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
           }
           sb.append(dp[n]).append("\n");
       }
       System.out.print(sb);
    }
}
/* 카드 구매하기 2 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] dp = new int[n+1];
//        int[] cost = new int[n+1];
//        for(int i = 1 ; i <= n ; i++) {
//            cost[i] = sc.nextInt();
//        }
//        for(int i = 1 ;i <= n ; i++) {
//            dp[i] = 10000;
//            for(int j = i ; j > 0 ; j--) {
//                dp[i] = Math.min(dp[i],dp[i-j] + cost[j]);
//            }
//        }
//        System.out.print(dp[n]);
//    }
/* 카드 구매하기 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] dp = new int[n+1];
//        int[] cost = new int[n+1];
//        for(int i = 1 ; i <= n ; i++) {
//            cost[i] = sc.nextInt();
//        }
//        for(int i = 1 ;i <= n ; i++) {
//            for(int j = i ; j > 0 ; j--) {
//                dp[i] = Math.max(dp[i],dp[i-j] + cost[j]);
//            }
//        }
//        System.out.print(dp[n]);
//    }
/* 1, 2, 3 더하기 */
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       StringBuilder sb = new StringBuilder();
//       int T = sc.nextInt();
//       int[] dp = new int[11];
//       dp[1] = 1;
//       dp[2] = 2;
//       dp[3] = 4;
//       while(T-->0) {
//           int n = sc.nextInt();
//           for(int i = 4 ; i <= n ; i++) {
//               dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
//           }
//           sb.append(dp[n]).append("\n");
//       }
//       System.out.print(sb);
//    }
/* 2+n 타일링2 */
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int[] dp = new int[n + 1];
//    dp[0] = 1;
//    dp[1] = 1;
//    for (int i = 2; i <= n; i++) {
//        dp[i] = (dp[i - 2]*2 + dp[i - 1]) % 10007 ;
//    }
//    System.out.print(dp[n]);
//}
/* 2+n 타일링 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] dp = new int[n + 1];
//        dp[0] = 1;
//        dp[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            dp[i] = (dp[i - 2] + dp[i - 1]) % 10007 ;
//        }
//        System.out.print(dp[n]);
//    }
/* 1 만들기 */
//    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int x = sc.nextInt();
//            int[] dp = new int[x+1];
//            dp[1] = 0;
//            for(int i = 2; i <= x ;i ++) {
//                dp[i] = Integer.MAX_VALUE;
//                if(i % 3 == 0 ) {
//                    dp[i] = Math.min(dp[i],dp[i/3]+1);
//                }
//                if(i % 2 == 0) {
//                    dp[i] = Math.min(dp[i],dp[i/2]+1);
//                }
//                dp[i] = Math.min(dp[i],dp[i-1]+1);
//            }
//            System.out.print(dp[x]);
//    }


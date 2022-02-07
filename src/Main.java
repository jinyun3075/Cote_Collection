import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int dp[] = new int[n];
       int val[] = new int[n];
       for(int i = 0 ; i < n ; i++) {
           val[i] = sc.nextInt();
       }
       dp[0] = val[0];
       int result = dp[0];
       for(int i = 1 ; i < n ; i++) {
           dp[i] = Math.max(dp[i-1]+val[i],val[i]);
           result = Math.max(dp[i],result);
       }
       System.out.print(result);
    }
}
/* 얀속합*/
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int dp[] = new int[n];
//        int val[] = new int[n];
//        for(int i = 0 ; i < n ; i++) {
//            val[i] = sc.nextInt();
//        }
//        dp[0] = val[0];
//        int result = dp[0];
//        for(int i = 1 ; i < n ; i++) {
//            dp[i] = Math.max(dp[i-1]+val[i],val[i]);
//            result = Math.max(dp[i],result);
//        }
//        System.out.print(result);
//    }
/* 가장 긴 증가하는 부분 수열 4*/
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] dp = new int[n];
//        int[] le = new int[n];
//        int result = 0;
//        for (int i =0 ;i<n;i++){
//            le[i]=sc.nextInt();
//        }
//        for(int i = 0; i<n;i++) {
//            dp[i] = 1;
//            for(int j = i-1; j>=0;j--){
//                if(le[j]<le[i]){
//                    dp[i] = Math.max(dp[j] + 1,dp[i]);
//                }
//            }
//            result =Math.max(result,dp[i]);
//        }
//        Stack<Integer> st = new Stack<>();
//        int val = result;
//        for(int i = n-1;i>=0;i--) {
//            if(val==dp[i]){
//                st.push(le[i]);
//                val--;
//            }
//        }
//        System.out.println(result);
//        while(!st.isEmpty()) {
//            System.out.print(st.pop()+" ");
//        }
//    }
/* 가장 긴 증가하는 부분 수열 */

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] dp = new int[n];
//        int[] le = new int[n];
//        int result = 0;
//        for (int i =0 ;i<n;i++){
//            le[i]=sc.nextInt();
//        }
//        for(int i = 0; i<n;i++) {
//            dp[i] = 1;
//            for(int j = i-1; j>=0;j--){
//                if(le[j]<le[i]){
//                    dp[i] = Math.max(dp[j] + 1,dp[i]);
//                }
//            }
//            result =Math.max(result,dp[i]);
//        }
//        System.out.print(result);
//    }

/* 이친수 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long[][] dp = new long[n+1][2];
//        dp[1][1]=1;
//
//        for(int i=2 ;i <=n;i++) {
//            dp[i][0] = dp[i-1][0] + dp[i-1][1];
//            dp[i][1] = dp[i-1][0];
//        }
//        System.out.print(dp[n][0]+dp[n][1]);
//    }
/* 쉬운 계단 수 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        final int DIV = 1000000000;
//        int n = sc.nextInt();
//        long[][] dp = new long[n+1][10];
//        long result = 0;
//        for(int i = 1 ;i < 10 ;i++) {
//            dp[1][i] =1;
//        }
//        for(int i = 2 ; i <= n ; i++) {
//            for(int j = 1 ; j < 9 ; j ++) {
//                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % DIV;
//            }
//            dp[i][9] = dp[i-1][8] % DIV;
//            dp[i][0] = dp[i-1][1] % DIV;
//        }
//        for(int i = 0 ;i < 10 ;i++) {
//            result += dp[n][i] % DIV;
//        }
//        System.out.print(result % DIV);
//    }
/* 1, 2, 3 더하고 5 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder sb= new StringBuilder();
//        final int DIV = 1000000009;
//        int T = sc.nextInt();
//        long[][] dp = new long[100001][4];
//        dp[1][1] = 1;
//        dp[2][2] = 1;
//        dp[3][1] = 1;
//        dp[3][2] = 1;
//        dp[3][3] = 1;
//
//        while(T-->0) {
//            int n = sc.nextInt();
//            for(int i = 4 ; i <= n ; i++) {
//                if(dp[i][1]==0 && dp[i][2]==0 && dp[i][3]==0){
//                    dp[i][1] = dp[i-1][2]+dp[i-1][3]%DIV;
//                    dp[i][2] = dp[i-2][1]+dp[i-2][3]%DIV;
//                    dp[i][3] = dp[i-3][1]+dp[i-3][2]%DIV;
//                }
//            }
//            sb.append((dp[n][1]+dp[n][2]+dp[n][3])%DIV).append("\n");
//        }
//        System.out.print(sb);
//    }

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


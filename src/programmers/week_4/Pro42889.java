package programmers.week_4;
import java.util.*;

public class Pro42889 {
    public static void main(String[] args) {
        int N =5;
        int[] stages ={2, 1, 2, 6, 2, 4, 3, 3};
        Pro42889 p = new Pro42889();
        for(int v : p.solution(N,stages)) {
            System.out.print(v);
        }
    }
    public int[] solution(int N, int[] stages) {
            int[] answer = {};
            int[] cnt = new int[N];
            for (int i = 0; i < stages.length; i++) {
                if (stages[i] < N + 1)
                    cnt[stages[i] - 1]++;
            }
            int man = stages.length;
            Double[] val = new Double[N];
            for (int i = 0; i < N; i++) {
                if(man==0){
                    val[i]=(double)0;
                }else{
                    val[i] = Double.valueOf((double) cnt[i] / (double) man);
                    man -= cnt[i];
                }
            }
            stage[] stage = new stage[N];
            for (int i = 0; i < N; i++) {
                stage[i] = new stage(i + 1, val[i]);

            }
            Arrays.sort(stage, new Comparator<stage>() {
                @Override
                public int compare(stage o1, stage o2) {
                    if(o1.val==o2.val){
                        return 0;
                    }
                    else if(o1.val>o2.val){
                        return -1;
                    }
                    else{
                        return 1;
                    }
                }
            });
            answer = new int[N];
            for(int i=0;i<N;i++){
                answer[i] = stage[i].stage;
            }
            return answer;
    }

    class stage {
        int stage;
        double val;

        stage(int a, double b) {
            stage = a;
            val = b;
        }

    }
}

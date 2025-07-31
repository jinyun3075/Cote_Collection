package greedy;
import java.io.*;
import java.util.StringTokenizer;

public class Bac2457 {
    public static class Flower{
        int st_month;
        int st_day;
        int end_month;
        int end_day;
        Flower(int st_month, int st_day, int end_month, int end_day){
            this.st_month = st_month;
            this.st_day = st_day;
            this.end_month = end_month;
            this.end_day = end_day;
        }
    }
    
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int flower_cnt = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Flower[] f_list = new Flower[flower_cnt];
        for(int i = 0 ; i < flower_cnt ;i++){
            st = new StringTokenizer(br.readLine());
            f_list[i] = new Flower(Integer.parseInt(st.nextToken())
            , Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        int start_month = 3;
        int start_day = 1;
        int next_month = 3;
        int next_day = 1;
        int result = 0;
        while(start_month < 12){
            for(Flower f : f_list){
                if(f.st_month < start_month || (f.st_month == start_month && f.st_day <= start_day)){
                    if(f.end_month > next_month || (f.end_month == next_month && f.end_day > next_day)){
                        next_month = f.end_month;
                        next_day = f.end_day;
                    }
                }
            }
            if(start_month == next_month && start_day == next_day){
                result = 0;
                break;
            }
            start_month = next_month;
            start_day = next_day;
            result++;
        }
        System.out.println(result);

    }
}


package bruteforce;

import java.util.Scanner;

public class Bac2529 {
    static boolean[] checkNum = new boolean[10];
    static int[] value;
    static String[] cal;
    static String max = "";
    static String min = "a";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        cal = new String[k];
        value = new int[k+1];
        for(int i=0;i<cal.length;i++) {
            cal[i] = sc.next();
        }

        for(int i=0;i<10;i++) {
            value[0] = i;
            checkNum[i] = true;
            logic(0,i,1);
            checkNum[i] = false;
        }
        System.out.println(max);
        System.out.println(min);

    }
    public static void logic(int k,int idx, int location) {
        if(k==cal.length) {
            String result ="";
            for(int i=0;i<value.length;i++) {
                result += value[i];
            }

            max = max.compareTo(result)>=0?max:result;
            min = min.compareTo(result)<0?min:result;
            return;
        }

        for(int i=0;i<10;i++) {
            if(!checkNum[i]) {
                checkNum[i] = true;
                if(cal[k].equals("<")) {
                    if(idx<i) {
                        value[location] = i;
                        logic(k+1, i, location+1);
                    }
                }else {
                    if (idx > i) {
                        value[location] = i;
                        logic(k+1, i, location+1);
                    } else {
                        checkNum[i] = false;
                        break;
                    }
                }
                checkNum[i] = false;
            }
        }
    }
}

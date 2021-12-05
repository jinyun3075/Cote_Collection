package basic;
import java.util.Scanner;
public class Bac2675 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Case = sc.nextInt();
        for (int i = 0; i < Case; i++) {
            int R = sc.nextInt();
            String[] val = sc.next().split("");
            for (int k = 0; k < val.length; k++) {
                for (int j = 0; j < R; j++) {
                    System.out.print(val[k]);
                }
            }
            System.out.println();
        }
    }
}

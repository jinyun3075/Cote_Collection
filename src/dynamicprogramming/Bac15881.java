package dynamicprogramming;

import java.util.Scanner;

public class Bac15881 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int dp[] = new int[input1];
        char input2[] = sc.next().toCharArray();
        int val=0;
        if(input1<4){
        }else{
            for(int i=4;i<=input1;i++){
                if(input2[i-4]=='p'&&input2[i-3]=='P'&&input2[i-2]=='A'&&input2[i-1]=='p'){
                    val++;
                    i+=4;
                }
            }
        }
        System.out.println(val);

    }
}

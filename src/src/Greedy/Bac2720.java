package src.Greedy;

import java.io.*;

public class Bac2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int kinds[] = {25,10,5,1};
        int Case =Integer.parseInt(bf.readLine());
        int val[][] =new int[Case][4];

        for(int i=0;i<Case;i++){
            int input = Integer.parseInt(bf.readLine());
            for(int j=0;j<4;j++){
                val[i][j]=input/kinds[j];
                input%=kinds[j];
            }
        }
        for(int i=0;i<Case;i++){
            for(int v :val[i]){
                System.out.print(v+" ");
            }
            System.out.println();
        }
    }
}

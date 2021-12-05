package bruteforce;

import java.util.Scanner;

public class Bac3085 {
    static int val =0;
    static char map[][];
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        map = new char[n][n];

        for(int i=0;i<n;i++){
            String input = sc.nextLine();
            for(int j=0;j<n;j++){
                map[i][j] = input.charAt(j);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                horizontalTemp(i,j);
                comp();
                horizontalTemp(i,j);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                verticalTemp(i,j);
                comp();
                verticalTemp(i,j);
            }
        }
        System.out.println(val);

    }
    static void horizontalTemp(int i,int j){
        char temp = map[i][j];
        map[i][j] = map[i][j+1];
        map[i][j+1] = temp;
    }
    static void verticalTemp(int j,int i){
        char temp = map[i][j];
        map[i][j] = map[i+1][j];
        map[i+1][j] = temp;
    }

    static void comp(){
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=0;j<n-1;j++){
                if(map[i][j]==map[i][j+1]){
                    count++;
                    val = Math.max(val,count);
                }else{
                    count=1;
                }
            }
        }

        for(int i=0;i<n;i++){
            int count=1;
            for(int j=0;j<n-1;j++){
                if(map[j][i]==map[j+1][i]){
                    count++;
                    val = Math.max(val,count);
                }else{
                    count=1;
                }
            }
        }
    }
}

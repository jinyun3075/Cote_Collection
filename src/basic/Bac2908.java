package basic;

import java.util.Scanner;

public class Bac2908 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tem1=Integer.parseInt(new StringBuilder().append(sc.nextInt()).reverse().toString());
        int tem2=Integer.parseInt(new StringBuilder().append(sc.nextInt()).reverse().toString());
        System.out.println(Math.max(tem1,tem2));
    }
}

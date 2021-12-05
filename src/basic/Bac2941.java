package basic;

import java.util.Scanner;

public class Bac2941 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String croa = sc.nextLine();
        String c = croa.replaceAll("[c][=-]","1").replaceAll("[d][-]","1")
                .replaceAll("[ln][j]","1").replaceAll("dz=","1").replaceAll("[sz][=]","1");

        System.out.println(c.length());
    }
}

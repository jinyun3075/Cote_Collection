package src.bruteforce;

import java.util.Scanner;

public class Bac10973 {
    static int[] arr;
    static void swap(int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        arr = new int[n];
        int val[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(logic()){
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }else{
            System.out.println("-1");
        }


    }

    static boolean logic(){
        int i = arr.length-1;
        while(i>0&&arr[i]>arr[i-1]){
            i--;
        }
        if(i<=0){
            return false;
        }

        int j =arr.length-1;

        while(arr[i-1]<arr[j]){
            j--;
        }

        swap(i-1,j);

        j=arr.length-1;
        while(i<j){
            swap(i,j);
            i++;
            j--;
        }
        return true;

    }
}


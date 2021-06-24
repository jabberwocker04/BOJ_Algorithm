package BronzeII_Under;

import java.util.Scanner;

public class Main_10871 {
    public static void main(String[] args){
        int N, X;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        X = sc.nextInt();
        
        int[] a = new int[N];
        for(int i=0; i<a.length; ++i){
            a[i] = sc.nextInt();
        } sc.close();
        for(int i=0; i<a.length; ++i){
            if(a[i] < X){
                System.out.print(a[i] +" ");
            }
        }
    }
}
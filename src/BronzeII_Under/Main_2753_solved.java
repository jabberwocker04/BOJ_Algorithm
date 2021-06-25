package BronzeII_Under;

import java.util.Scanner;

public class Main_2753_solved {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        a = sc.nextInt();
        sc.close();
        b = a%4;
        c = a%400;
        d = a%100;
        if (b==0){
            if(d!=0 || c==0)
            System.out.print("1");
            else {
                System.out.print("0");
            }
        }else if(b>=1){
            System.out.print("0");
        }
        
    }
}
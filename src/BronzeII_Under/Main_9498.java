package BronzeII_Under;

import java.util.Scanner;

public class Main_9498 {
	public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        
        if(a>=90){
            System.out.print("A");
        }else if(a>=80){
            System.out.print("B");
        }else if(a>=70){
            System.out.print("C");
        }else if(a>=60){
            System.out.print("D");
            
        }else if(60>=a){
            System.out.print("F");
        }
        
    }
}
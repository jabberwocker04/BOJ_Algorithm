package BronzeII_Under;

import java.util.Scanner;

public class Main_5543 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = 2001;
		int b = 2001;
			for(int i=0; i<3; i++) {
				
				int temp = sc.nextInt();
				
				if(temp < a){
				a = temp;
				}
			}
			
			for(int i=0; i<2; i++) {
				
				int temp2 = sc.nextInt();
				
					if(temp2 < b){
					b = temp2;
					}
			}
		System.out.println(a+b-50);
	}
}
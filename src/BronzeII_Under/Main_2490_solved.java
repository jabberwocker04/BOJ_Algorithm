package BronzeII_Under;

import java.util.Scanner;

public class Main_2490_solved {
public static void main(String[] args) throws Exception {
		
		// 1->1 0->3 �� || 1->2 0->2 �� || 
		//1->3 || 0->1->�� || 1->4�� || 0->4 ��
		Scanner sc = new Scanner(System.in);
		int a,b,c,d, sum=0;
		String result=null;
		
		for(int i=0; i<3; i++) {
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		sum = a+b+c+d;
		
		if( sum==0 ) {
			result = "D";
		} else if( sum==1 ) {
			result = "C";
		} else if ( sum==2) {
			result = "B";
		} else if ( sum==3) {
			result = "A";
		} else if ( sum==4) {
			result = "E";
		}
		
		System.out.println(result);
	}
		}	
	}
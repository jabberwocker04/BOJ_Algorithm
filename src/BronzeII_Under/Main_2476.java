package BronzeII_Under;

import java.util.*;

public class Main_2476 { // 백준 solved.ac 푸는용도임.

	public static void main(String[] args) throws Exception {
		
		// a = b = c -> 10,000 + a*1,000
		// a = b or a = c or b = c -> 1,000 + a == b*100
		// a != b != c -> max * 1,00
		int testcase;
		int a, b, c, max, sum;
		max = 0;
		sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		testcase = sc.nextInt();
		
		for(int i=0; i<testcase; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		if(a == b && b == c) {
			sum = 10000+a*1000;
		} 
		//같은 눈 세개인 경우
		
		else if (a==b ) {
			sum = 1000+a*100;
		} else if ( b==c ) {
			sum = 1000+b*100;
		} else if (c==a) {
			sum = 1000+c*100;
		}  
		//같은 눈 두개인 경우
		else if ( a>b && b>c || a>c && c>b) {
			sum = 100*a;
		} else if ( b>a && a>c || b>c && c>a) {
			sum = 100*b;
		} else if ( c>a && a>b || c>b && b>a) {
			sum = 100*c;
		}
		//같은 눈 세개인 경우
	
		if( sum > max) {
			max = sum;
		} else
			max = max;
		
		}
		System.out.println(max);
		}	
	}
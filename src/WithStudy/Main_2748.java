package WithStudy;

import java.util.Scanner;

public class Main_2748 {

	public static void main(String[] args) {
		int p=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0, b=1, c=0;
		
		for(int i=0; i<n; i++) {
			c = a+b;
			a = b;
			b = c;
		}
		
		System.out.println(c);
	}

}

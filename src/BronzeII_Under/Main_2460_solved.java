package BronzeII_Under;

import java.util.*;

public class Main_2460_solved { // ���� solved.ac Ǫ�¿뵵��.

	public static void main(String[] args) throws Exception {
		
		int max = 0, sum = 0;
		int in, out;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			out = sc.nextInt();
			in = sc.nextInt();
			
			sum = (sum + in) - out;
			if(max>sum) {
				max = max;
			} else if (max<sum) {
				max = sum;
			}
			
		}
			System.out.println(max);
		}	
	}
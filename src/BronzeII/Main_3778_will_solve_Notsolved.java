package BronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_3778_will_solve_Notsolved { // �ֳʱ׷� �Ÿ�

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Test; 
		Test = Integer.parseInt(br.readLine());
		String a,b;
		String[] a_1 = null;
		String[] b_1 = null;
		int count = 0;
		
		for(int i=0; i<Test; i++) {
			a = br.readLine();
			b = br.readLine();
			
			
			a_1 = a.split("");
			b_1 = b.split("");
			
			Arrays.sort(a_1);
			Arrays.sort(b_1);
			
			
		for(int j=0; j<a.length(); j++) {
			if(a_1[j].equals(b_1[j])) {
				a_1[j]
			} else if (b_1[j] == null) {
				b_1[j] = a_1[j];
			}
		}
		
		
		
		//for(int k=0; i<a.length(); i++) {
			System.out.println(count);
		//	}
			
		}
		
		for(int i=0; i<a_1.length; i++) {
			System.out.print(a_1[i]);
			}
		
		System.out.println("");
		
		for(int i=0; i<a_1.length; i++) {
			System.out.print(b_1[i]);
			}
		
		
		
		
	}
}

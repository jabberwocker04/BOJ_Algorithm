package BronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_1225_solved_but_Nullpointer_Error {

	public static void main(String[] args) throws IOException {
		
		// a*b
		//a 에서 한자리를뽑는다. *B에서 임의의 한자리를 뽑아 곱함.
		//의 가능한 모든조합(A가 n자리, B가 m자리 수라면 총 가능한 조합은 n*m)을 더한 수로 정의
		//ex)121*34
		// 1*3 + 1*4 + 2*3 + 2*4 + 1*3 + 1*4
		// == 1(3+4) + 2(3+4) + 1(3+4)
		// == 3+4(1+2+1)
		// == (3+4)(1+2+1) == 7 * 4 = 28
		//A,B는 10000자리를 넘지 않는다.
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a[] = br.readLine().split(" ");
		String[] a_a;
		String[] a_b;
		a_a = a[0].split("");
		a_b = a[1].split("");
		int suma = 0;
		int sumb = 0;
		
		for(int i=0; i<a[0].length(); i++) {
			suma = suma + Integer.valueOf(a_a[i]);
		}
		for(int i=0; i<a[1].length(); i++) {
			sumb = sumb + Integer.valueOf(a_b[i]);
		}

		sum = suma * sumb;
		System.out.println(sum);
			
	}
}
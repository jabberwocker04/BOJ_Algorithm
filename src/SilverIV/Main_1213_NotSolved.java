package SilverIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1213_NotSolved {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		
		String[] A_A = new String[A.length()];
		A_A = A.split("");
		Arrays.sort(A_A);
		
		
		
		String[] B_B = new String[A.length()/2];
		String[] C_C = new String[A.length()/2];
		
		
		for(int i=0; i<A_A.length; i++) {
			if(i%2==0) {
				B_B[i/2] = A_A[i];
			}
		}
		
		for(int i=1; i<A_A.length; i++) {
			if(i%2==1) {
				C_C[i/2] = A_A[i];
			}
		}
		
		
		for(int i=0; i<B_B.length; i++) {
			System.out.print(A_A[i]);
		}
		
		for(int i=1; i<C_C.length; i++) {
			System.out.print(C_C[i]);
		}
	}
}

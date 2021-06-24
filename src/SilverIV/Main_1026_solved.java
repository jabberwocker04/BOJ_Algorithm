package SilverIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1026_solved {

	public static void main(String[] args) throws Exception { // 보물
		// 가장 작은 합계 만들기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[]A = new int[N];
		int[]B = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		int C = 0;
		int j = N-1;
		for(int i=0; i<N; i++) {		
			C = C + (A[i] * B[j]);
			j--;
		}
		System.out.println(C);
	}
}
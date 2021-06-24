package BronzeI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2167 {

	public static void main(String[] args) throws Exception {
		int[][] a;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
		int[][] b = a.clone();

		for(int i=0; i<a.length; i++) {
			st = new StringTokenizer(br.readLine());			
			for(int j=0; j<a[i].length; j++) {				
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int T = Integer.parseInt(br.readLine());
		for(int k=0; k<T; k++) {
			int sum = 0;
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int i_i=i-1; i_i<=x-1; i_i++) {
				for(int j_j=j-1; j_j<=y-1; j_j++) {
					sum = sum + a[i_i][j_j];
				}
			}
			System.out.println(sum);
		}
	
	}
}

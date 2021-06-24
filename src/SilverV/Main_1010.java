package SilverV;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1010 {

	public static void main(String[] args) throws Exception { // 05.24
		//서쪽 N =< 동쪽 M
		//서쪽과 동쪽을 이으려고 하며 최대 한개 다리만 가능
		//다리를 최대한 많이 지으려 하기 때문에 최소 N개의 다리 가능
		//다리를 지을 수 있는 경우의 수를 구하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Test = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=0; i<Test; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int bridge_a = Integer.parseInt(st.nextToken())+1;
			int bridge_b = Integer.parseInt(st.nextToken())+1;
			int[][] asdf = new int[bridge_a][bridge_b];
			
			for(int k=0; k<bridge_b; k++) {
				asdf[0][k] = k;
				}
	
			
			for(int j=1; j<bridge_a; j++) {
				for(int k=1; k<bridge_b; k++) {
					asdf[j][k] = asdf[j][k-1] + asdf[j-1][k-1];
					}
				}
			
			
			int result = asdf[bridge_a][bridge_b];
			
			for(int j=0; j<bridge_a; j++) {
				for(int k=0; k<bridge_b; k++) {
					System.out.print(asdf[j][k]);		
				}
				System.out.println("");
			}
		}
	}
}

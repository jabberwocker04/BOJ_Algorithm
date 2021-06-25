package SilverIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_16439_Notsolved {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());//N M 입력
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][]NM = new int[N][M]; 
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				NM[i][j] = Integer.parseInt(st.nextToken());
			}
		} // 인풋입력
		
		int[] MAX = new int[3];
		int[] MAX_N = new int[N];
		System.out.println(sum);
		for(int i=0; i<N; i++) {
			;
			for(int j=0; j<M; j++) {
				System.out.
			}
		}
	}
}

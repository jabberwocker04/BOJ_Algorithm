package today_solving;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;

//아이스크림 처먹지마

public class Main_2422_2 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		boolean[][] icecream = new boolean[N][N];
		
		for(int i=1; i<= N; i++) {
			for(int j = i+1; j<=N; j++) {
				icecream[i][j] = true;
				icecream[j][i] = true;
			}
		}
		
		for(int i=0; i<M; i++) {
			int a, b;
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			icecream[a][b] = false;
			icecream[b][a] = false;
		}
		
		int answer = 0;
		for (int i = 1; i <= N; i++) {
	        for (int j = i + 1; j <= N; j++) {
	            if (icecream[i][j] == true) {
	                for (int k = j + 1; k <= N; k++) {
	                    if (icecream[i][k] == true && icecream[j][k] == true) {
	                        answer++;
	                    }
	                }
	            }
	        }
	    }
		System.out.println(answer);
	}
}